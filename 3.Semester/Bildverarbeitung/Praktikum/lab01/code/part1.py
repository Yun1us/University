#!/usr/bin/python3

import numpy as np
from math import floor

def create_Gaussian_kernel(cutoff_frequency):
  """
  Returns a 2D Gaussian kernel using the specified filter size standard
  deviation and cutoff frequency.

  The kernel should have:
  - shape (k, k) where k = cutoff_frequency * 4 + 1
  - mean = floor(k / 2)
  - standard deviation = cutoff_frequency
  - values that sum to 1

  Args:
  - cutoff_frequency: an int controlling how much low frequency to leave in
    the image.
  Returns:
  - kernel: numpy nd-array of shape (k, k)

  HINT:
  - The 2D Gaussian kernel here can be calculated as the outer product of two
    vectors with values populated from evaluating the 1D Gaussian PDF at each
    corrdinate.
  """

  standart_deviaton = cutoff_frequency

  k = cutoff_frequency * 4 + 1 
  
  mean = floor(k / 2)

  # Create 1D Gaussian kernel
  kernel_1d = np.fromfunction(
      lambda x: (1 / (np.sqrt(2 * np.pi) * standart_deviaton)) * np.exp(- (x - mean)**2 / (2 * standart_deviaton**2)),
      (k,)
  )

  # Create 2D Gaussian kernel as the outer product of two 1D Gaussian kernels
  kernel_2d = np.outer(kernel_1d, kernel_1d)

  # Normalize the kernel so that the sum of all elements is 1
  kernel = kernel_2d / np.sum(kernel_2d)

  return kernel

def my_imfilter(image, filter):
  """
  Apply a filter to an image. Return the filtered image.

  Args
  - image: numpy nd-array of shape (m, n, c)
  - filter: numpy nd-array of shape (k, j)
  Returns
  - filtered_image: numpy nd-array of shape (m, n, c)

  HINTS:
  - You may not use any libraries that do the work for you. Using numpy to work
   with matrices is fine and encouraged. Using OpenCV or similar to do the
   filtering for you is not allowed.
  - I encourage you to try implementing this naively first, just be aware that
   it may take an absurdly long time to run. You will need to get a function
   that takes a reasonable amount of time to run so that the TAs can verify
   your code works.
  """

  assert filter.shape[0] % 2 == 1
  assert filter.shape[1] % 2 == 1

  filtered_image = np.zeros_like(image)
  pad_height = filter.shape[0] // 2
  pad_width = filter.shape[1] // 2

  padded_image = np.pad(image, ((pad_height, pad_height), (pad_width, pad_width), (0, 0)), mode='constant')

  for c in range(image.shape[2]):
    for i in range(image.shape[0]):
      for j in range(image.shape[1]):
        filtered_image[i, j, c] = np.sum(padded_image[i:i+filter.shape[0], j:j+filter.shape[1], c] * filter)

  return filtered_image

def create_hybrid_image(image1, image2, filter):
  """
  Takes two images and a low-pass filter and creates a hybrid image. Returns
  the low frequency content of image1, the high frequency content of image 2,
  and the hybrid image.

  Args
  - image1: numpy nd-array of dim (m, n, c)
  - image2: numpy nd-array of dim (m, n, c)
  - filter: numpy nd-array of dim (x, y)
  Returns
  - low_frequencies: numpy nd-array of shape (m, n, c)
  - high_frequencies: numpy nd-array of shape (m, n, c)
  - hybrid_image: numpy nd-array of shape (m, n, c)

  HINTS:
  - You will use your my_imfilter function in this function.
  - You can get just the high frequency content of an image by removing its low
    frequency content. Think about how to do this in mathematical terms.
  - Don't forget to make sure the pixel values of the hybrid image are between
    0 and 1. This is known as 'clipping'.
  - If you want to use images with different dimensions, you should resize them
    in the notebook code.
  """

  assert image1.shape[0] == image2.shape[0]
  assert image1.shape[1] == image2.shape[1]
  assert image1.shape[2] == image2.shape[2]
  assert filter.shape[0] <= image1.shape[0]
  assert filter.shape[1] <= image1.shape[1]
  assert filter.shape[0] % 2 == 1
  assert filter.shape[1] % 2 == 1

  low_frequencies = my_imfilter(image1, filter)
  high_frequencies = image2 - my_imfilter(image2, filter)
  hybrid_image = np.clip(low_frequencies + high_frequencies, 0, 1)

  return low_frequencies, high_frequencies, hybrid_image
