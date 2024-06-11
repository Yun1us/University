import math


#Lab 02

def a_plus_abs_b(a, b):

    """Return a+abs(b), but without calling abs.
    >>> a_plus_abs_b(2, 3)
    5
    >>> a_plus_abs_b(2, -3)
    5
    >>> a_plus_abs_b(-1, 4)
    3
    >>> a_plus_abs_b(-1, -4)
    3
    """
    if b < 0:
        b = -b
    return a + b

def two_of_three(i, j, k):

    """Return m*m + n*n, where m and n are the two smallest members of the
    positive numbers i, j, and k.
    >>> two_of_three(1, 2, 3)
    5
    >>> two_of_three(5, 3, 1)
    10
    >>> two_of_three(10, 2, 8)
    68
    >>> two_of_three(5, 5, 5)
    50
    """
    if i > j and i > k:
        m = j
        n = k
    elif j > i and j > k:
        m = i
        n = k
    else:
        m = i
        n = j

    return m*m + n*n

def largest_factor(n):

    """Return the largest factor of n (n > 1 !) that is smaller than n.
    A factor divides a number evenly.
    >>> largest_factor(15) # factors are 1, 3, 5
    5
    >>> largest_factor(80) # factors are 1, 2, 4, 5, 8, 10, 16, 20, 40
    40
    >>> largest_factor(13) # factor is 1 since 13 is prime
    1
    """
    counter = 1
    factor = 0

    if n <= 1:
        return None
    
    while counter < n:
        if n % counter == 0:
            factor = counter
            counter += 1
        else:
            counter += 1

    return factor

def double_eights(n):

    """Return true if n has two eights in a row.
    >>> double_eights(8)
    False
    >>> double_eights(88)
    True
    >>> double_eights(2882)
    True
    >>> double_eights(880088)
    True
    >>> double_eights(12345)
    False
    >>> double_eights(80808080)
    False
    """

    if "88" in str(n):
        return True
    else:
        return False

def getKthDigit(n, k):

    """
    Return the kth digit of n (an integer), starting from 0,
    counting from the right.
    >>> getKthDigit(789, 0)
    9
    >>> getKthDigit(789, 1)
    8
    >>> getKthDigit(789, 2)
    7
    >>> getKthDigit(789, 3)
    0
    >>> getKthDigit(-789, 0)
    9
    """

    result = 0
    n = str(n)

    if k >= len(n):
        return 0

    result = int(n[-k - 1])
    
    return result

def setKthDigit(n, k, d):

    """
    n is an integer, k is a non-negative integer and d is non-negative
    single digit (0 = d = 9). Return the number n with the kth digit
    replaced with d.
    >>> setKthDigit(468, 0, 1)
    461
    >>> setKthDigit(468, 1, 1)
    418
    >>> setKthDigit(468, 2, 1)
    168
    >>> setKthDigit(468, 3, 1)
    1468
    """


    n = list(str(n))
    m = n

    while k >= len(m):
        n = n.insert(0, "1")

    if m != n:
        result = "".join(m)
        return int(result)


    n[-k -1] = str(d)
    result = "".join(n)
    return int(result)

def sum_digits(y):

    """Sum all the digits of y. y is always nonnegative. Floor division
    and modulo might be helpful.
    >>> sum_digits(10) # 1 + 0 = 1
    1
    >>> sum_digits(4224) # 4 + 2 + 2 + 4 = 12
    12
    >>> sum_digits(1234567890)
    45
    >>> a = sum_digits(123) # use return rather than print in your code!
    >>> a
    6

    Alt:

    result = 0
    y = list(str(y))
    for digits in y:
        result += int(digits)

  
    return result

    """


    result = 0

    while y > 0:
        digit = y % 10
        result += digit
        y = y // 10

    return result

#Lab 03

def max_product(s):
    """
    Let lst be a list of integers. Return the maximum product that can
    be formed using non-consecutive elements of lst.
    >>> max_product([10,3,1,9,2]) # 10 * 9
    90
    >>> max_product([5,10,5,10,5]) # 5 * 5 * 5
    125
    >>> max_product([])
    1
    """

    """if s == []:
        return 1
    
    result = 0
    for num1 in s:
        idx1 = s.index(num1)
        for num2 in s:
            if idx1 + 1 != s.index(num2) and idx1 -1 != s.index(num2) and idx1 != s.index(num2):
                if num1 * num2 > result:
                    idx2 = s.index(num2)
                    result = num1 * num2
                    for num3 in s:
                        if idx1 + 1 != s.index(num3) and idx1 -1 != s.index(num3) and idx1 != s.index(num3) and idx2 + 1 != s.index(num3) and idx2 -1 != s.index(num3) and idx2 != s.index(num3):
                            if num1 * num2 * num3 > result:
                                result = num1 * num2 * num3

    return result"""

    #unfinished

def remove_odd_indices(lst, odd, weight):
    """
    lst is a list, odd is a boolean. Return a new list with elements from ls
    removed at certain indices: If odd is True, remove elements at odd indic
    otherwise remove even indexed elements. The remaining elements are
    multiplied by weight.
    >>> s = [1, 2, 3, 4]
    >>> t = remove_odd_indices(s, True, 1)
    >>> s
    [1, 2, 3, 4]
    >>> t
    [1, 3]
    >>> l = [5, 6, 7, 8]
    >>> m = remove_odd_indices(l, False, 4)
    >>> m
    [24, 32]
    """
    new_lst = []
    result = []
    

    if odd == True:
        new_lst = lst[0::2]
    else:
        new_lst = lst[1::2]
    

    for elem in new_lst:
            result.append(elem * weight)
        
    
    return result

def merge(lst1, lst2):

    """Merges two sorted lists, lst1 and lst2. The new list contains all
    elements in sorted order.
    >>> merge([1, 3, 5], [2, 4, 6])
    [1, 2, 3, 4, 5, 6]
    >>> merge([], [2, 4, 6])
    [2, 4, 6]
    >>> merge([1, 2, 3], [])
    [1, 2, 3]
    >>> merge([5, 7], [2, 4, 6])
    [2, 4, 5, 6, 7]
    """
    
    result = sorted(lst1 + lst2)

    return result

def alternatingSum(lst):

    """
    Return the alternating sum of the integer or float elements
    in the list lst. An alternating sum of a sequence is a sum
    where the sign alternates from positive to negative or
    vice versa.
    > alternatingSum([5, 3, 8, 4])
    6
    > alternatingSum([])
    0
    """

    sum = 0

    if lst == []:
        return 0

    for elem in lst:
        sum += elem - lst[1]
        lst = lst[2::]


    return sum

def is_anagram(s1, s2):

    """
    Decide whether a string s1 and a string s2 are anagrams.
    Use only lists in your solution.
    >>> is_anagram("", "")
    True
    >>> is_anagram("abCdabCd", "abcdabcd")
    True
    >>> is_anagram("abcdaabcd", "aabbcddcb")
    False
    """

    s1, s2 = s1.lower(), s2.lower()
    s1, s2 = list(s1), list(s2)
  
    for elem in s1:
        if elem != s2[s1.index(elem)]:
            return False

    return True

def rotateStringLeft(s, n):

    """
    The function takes a string s and a possibly-negative integer n.
    If n is non-negative, the function returns the string s rotated
    n places to the left. If n is negative, the function returns
    the string s rotated |n| places to the right.
    >>> rotateStringLeft('abcd', 1)
    'bcda'
    >>> rotateStringLeft('abcd', -1)
    'dabc'
    """
    
    s = list(s)
    s = s[n::] + s[:n:]
    
    return "".join(s)

def caesar_cipher(message, shift):
    """
    A Caesar Cipher is a simple cipher that works by shifting
    each letter in the given message by a certain number. For
    example, if we shift the message "We Attack At Dawn" by 1
    letter, it becomes "Xf Buubdl Bu Ebxo".
    ceasar_cipher(message, shift) shifts the given message by
    'shift' many letters. You are guaranteed that 'message' is a
    string, and that 'shift' is an integer between -25 and 25.
    Capital letters should stay capital and lowercase letters
    should stay lowercase, and non-letter characters should
    not be changed. "Z" wraps around to "A".
    >>> caesar_cipher("We Attack At Dawn", 1)
    "Xf Buubdl Bu Ebxo"
    >>> caesar_cipher("zodiac", -2)
    "xmbgya"
    """
    
    secret_message = ""

    upper = list("ABCDEFGHIJKLMNOPQRSTUVW")
    lower = list("abcdefghijklmnopqrstuvwxyz")

    for letter in message:
        if letter in upper:
            index = upper.index(letter) + shift
            secret_message += upper[index]
        else:
            index = lower.index(letter) + shift
            secret_message += lower[index]

    return secret_message
            

    

    return result

def most_frequent(L):

    """
    Return the most frequent element in a list L, resolving
    ties arbitrarily. L only has elements of scalar types.
    >>> most_frequent([2,5,3,4,6,4,2,4,5])
    4
    >>> most_frequent([2,3,4,3,5,3,6,3,7])
    3
    >>> most_frequent([42])
    42
    >>> most_frequent([])
    None
    """

    if L == []:
        return None

    D = {}
    for digit in L:
        if digit in D.keys():
            D[digit] += 1
        else:
            D[digit] = 1

    comparator = 0
    result = 0

    for key, value in D.items():
        if value > comparator:
            comparator = value
            result = key

    return result

def is_anagram(s1, s2):


    """
    Decide whether a string s1 and a string s2 are anagrams.
    Use only dictionaries in your solution.
    > is_anagram("", "")
    True
    > is_anagram("abCdabCd", "abcdabcd")
    True
    > is_anagram("abcdaabcd", "aabbcddcb")
    False
    """

    D = {"1": s1.lower()}
    D2 = {"2": s2.lower()}

    if D["1"] == D2["2"]:
        return True
        
    else:
        return False

#Lab 04

def oddCount(L):

    """
    Without using iteration, write the recursive function oddCount(L) 
    which given a possibly-empty
    list L of integers, returns the number of odd integers in L
    >>> oddCount([0,1,2,3,4,5])
    3
    >>> oddCount([2, 3, 1, 5, 6, 1])
    4
    """
    
    if L == []:
        return 0

    if L[0] % 2 != 0:
        counter = 1
    else:
        counter = 0
    
    return counter + oddCount(L[1::]) 

def oddSum(L):

    """
    Without using iteration, write the recursive function oddSum(L) 
    which given a possibly-empty list L of integers, returns the sum 
    of the odd integers in L . Do not create a new list. Return 0 if the
    list has no odd integers in it
    >>> oddSum([3, 2, 1, 5])
    3
    >>> oddSum([1])
    1
    >>> oddSum([])
    0
    """

    if L == []:
        return 0

    if L[0] % 2 != 0:
        sum = 1
    else:
        sum = 0

    return sum + oddSum(L[1::])

def oddsOnly(L):

    """
    Without using iteration, write the recursive function oddsOnly(L)
    which given a possibly-empty list L of integers, returns a new list 
    containing only the odd integers in L in the same order they appear in L .
    >>> oddsOnly([2, 3, 1, 5])
    [3, 1, 5]  
    >>> oddsOnly([2, 3, 1, 5, 7, 8, 9, 0])  
    [3, 1, 5, 7, 9]
    """
    
    lst = []

    if L == []:
        return lst

    if L[0] % 2 != 0:
        lst.append(L[0])
        
    return lst + oddsOnly(L[1::])

def maxOdd(L):
    """
    Without using iteration, write the recursive function maxOdd(L)
    which given a possibly-empty list L of integers, returns the largest
    odd integer in L , or None if L does not contain any odd integers
    >>> maxOdd([3, 2, 5, 1])
    5
    >>> maxOdd([2, 4, 6])
    
    """
    max_odd = 0
    
    
    
    if len(L) == 1 and L[0] % 2 == 0:
        return None
    elif len(L) == 0:
        return max_odd

        
    
    if L[0] % 2 != 0 and L[0] > max_odd:
        max_odd = L[0]
        return max(max_odd,  maxOdd(L[1::]))        #if max_odd >  maxOdd(L[1::]):
                                                    #   return max_odd
                                                    #else: return maxOdd(L[1::])
    return maxOdd(L[1::])                           
    
def hasConsecutiveDigits(n):


    """
    Without using iteration, write the recursive function hasConsecutiveDigits(n)
    that takes a possibly-negative int value n and returns True if that number
    contains two consecutive digits that are the same, and False otherwise.
    >>> hasConsecutiveDigits(53351)
    True
    >>> hasConsecutiveDigits(21538)
    False
    """
    n = str(n)
    n = list(n)

    if len(n) <= 1:
        return False
    
    if (n[0]) == (n[1]):
        return True
    
    else:
        n = n[1::]
        n = "".join(n)
        return hasConsecutiveDigits(n)
    
def alternatingSum(L):

    """
    Without using iteration, write the function alternatingSum(L) 
    that takes a possibly-empty listof numbers L , and returns the 
    alternating sum of the list, where every other value is subtracted
    rather than added. For example: alternatingSum([1,2,3,4,5]) returns
    1-2+3-4+5 (that is, 3). If L is empty, return 0.
    >>> alternatingSum([3, 2, 5, 1, 2, 1])
    6
    >>> alternatingSum([2, 1, 5, 2, 1])
    5
    >>> alternatingSum([4])
    4
    """
    sum = 0

    if L == []:
        return 0
    
    if len(L) == 1:
        return sum + L[0]
    
    if len(L) >= 2:
        sum = L[0] - L[1]
        return sum + alternatingSum(L[2::])
    
def is_palindrome(strng): #recursion

    """
    Implement the function is_palindrome(strng) that tests whether 
    a string strng of length at least 1 is a palindrom. Implement 
    two versions: One implementation should only use recursion,
    the other version should use a python loop.
    >>> is_palindrome("Hallo")
    False
    >>> is_palindrome("ajja")
    True
    """

    strng = list(strng)

    if len(strng) <= 1:
        return True
    
    if strng[0].lower() == strng[-1].lower():
        return is_palindrome(strng[1:1:])
    
    else: return False

def is_palindrome(strng): #loop

    """
    Implement the function is_palindrome(strng) that tests whether 
    a string strng of length at least 1 is a palindrom. Implement 
    two versions: One implementation should only use recursion,
    the other version should use a python loop.
    >>> is_palindrome("Hallo")
    False
    >>> is_palindrome("ajaja")
    True
    """

    strng = list(strng)

    if len(strng) <= 1:
        return True
    
    for letter in strng:
        if len(strng) <= 1:
            return True
        else:
            if letter == strng[-1]:
                strng = strng[1:1:]
            else: return False

def num_eights(pos):

    """
    Write a recursive function num_eights that takes a 
    positive integer pos and returns the number
    of times the digit 8 appears in pos .
    >>> num_eights(4568)
    1
    >>> num_eights(4564)
    0


    """   

    counter = 0
    
    pos = str(pos)
    pos = list(pos)

    if len(pos) == 1:
        if pos[0] == "8":
            counter += 1
            return counter 
        else: return counter


    if pos[0] == "8":
        pos = pos[1::]
        pos = "".join(pos)
        counter += 1
        return counter + num_eights(pos)
    
    else: 
        pos = pos[1::]
        pos = "".join(pos)
        return counter + num_eights(pos)
    
def merge(dict1, dict2):

    """
    Implement merge(dict1, dict2) that merges two dictionaries dict1 and 
    dict2 having either int or float values and returns a new dictionary. 
    If a key appears in both dictionaries the value for this key in the new 
    dictionary is the sum of the values.
    >>> merge({1: 3, 2: 1, 3: 0.5}, {2: 2, 3: 2, 4: 1})
    {1: 3, 2: 3, 3: 2.5, 4: 1}
    """


    
    for key, value in dict2.items():
        if key in dict1.keys():
            dict1[key] += value
        else:
            dict1[key] = value


    return dict1

#Lab 05

class VendingMachine:
    """A vending machine that vends some product for some price.
    >>> v = VendingMachine('candy', 10)
    >>> v.vend()
    'Nothing left to vend. Please restock.'
    >>> v.add_funds(15)
    'Nothing left to vend. Please restock. Here is your $15.'
    >>> v.restock(2)
    'Current candy stock: 2'
    >>> v.vend()
    'Please add $10 more funds.'
    >>> v.add_funds(7)
    'Current balance: $7'
    >>> v.vend()
    'Please add $3 more funds.'
    >>> v.add_funds(5)
    'Current balance: $12'
    >>> v.vend()
    'Here is your candy and $2 change.'
    >>> v.add_funds(10)
    'Current balance: $10'
    >>> v.vend()
    'Here is your candy.'
    >>> v.add_funds(15)
    'Nothing left to vend. Please restock. Here is your $15.'
    >>> w = VendingMachine('soda', 2)
    >>> w.restock(3)
    'Current soda stock: 3'
    >>> w.restock(3)
    'Current soda stock: 6'
    >>> w.add_funds(2)
    'Current balance: $2'
    >>> w.vend()
    'Here is your soda.'
    """
    stock = 0
    balance = 0

    def __init__(self, item, cost):
        self.item = item
        self.cost = cost

    def vend(self):
        if self.stock == 0:
            return 'Nothing left to vend. Please restock.'
        if self.balance > self.cost:
            print(f"'Here is your candy and ${self.balance - self.cost} change.'")
            self.balance = 0
            self.stock -= 1
        elif self.balance < self.cost:
            return (f'Please add ${self.cost - self.balance} more funds.')
        else:
            self.balance = 0
            self.stock -= 1
            return(f'Here is your {self.item}.')
            

    def restock(self, restock):
        self.stock += restock
        print(f"'Current {self.item} stock: {self.stock}'")


    def add_funds(self, added_fund):
        if self.stock == 0:
            return (f'Nothing left to vend. Please restock. Here is your ${added_fund}.')
        self.balance += added_fund
        return (f'Current balance: ${self.balance}')
    
#Lab 06

class Account:
    """An account has a balance and a holder.
    >>> a = Account('John')
    >>> a.deposit(10)
    10
    >>> a.balance
    10
    >>> a.interest
    0.02
    >>> a.time_to_retire(10.25) # 10 -> 10.2 -> 10.404
    2
    >>> a.balance # balance should not change
    10
    >>> a.time_to_retire(11) # 10 -> 10.2 -> . -> 11.040808032
    5
    >>> a.time_to_retire(100)
    117
    """
    max_withdrawal = 10
    interest = 0.02
   
    

    def __init__(self, account_holder):
        self.balance = 0
        self.holder = account_holder

    def deposit(self, amount):
        self.balance = self.balance + amount
        return self.balance
    
    def withdraw(self, amount):
        if amount > self.balance:
            return "Insufficient funds"
    
        if amount > self.max_withdrawal:
            return "Can't withdraw that amount"
        self.balance = self.balance - amount
        return self.balance
    
    def time_to_retire(self, amount):
        assert self.balance > 0 and amount > 0 and self.interest > 0
        year = 0
        counter = self.balance
        while counter < amount:
            year += 1
            counter += counter * self.interest
        return year  

class FreeChecking(Account):

    """A bank account that charges for withdrawals, but the first two are fr
    >>> ch = FreeChecking('Jack')
    >>> ch.balance = 20
    >>> ch.withdraw(100) # First one's free
    'Insufficient funds'
    >>> ch.withdraw(3) # And the second
    17
    >>> ch.balance
    17
    >>> ch.withdraw(3) # Ok, two free withdrawals is enough
    13
    >>> ch.withdraw(3)
    9
    >>> ch2 = FreeChecking('John')
    >>> ch2.balance = 10
    >>> ch2.withdraw(3) # No fee
    7
    >>> ch.withdraw(3) # ch still charges a fee
    5
    >>> ch.withdraw(5) # Not enough to cover fee + withdraw
    'Insufficient funds'
    """
    withdraw_fee = 1
    free_withdrawals = 2

    def __init__(self, Account):
        self.balance = 0
        self.account = Account

    def balance(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if self.free_withdrawals > 0:
            if self.balance < amount:
                self.free_withdrawals -= 1
                return "Insufficient funds"
            else:
                self.free_withdrawals -= 1
                self.balance -= amount
                return self.balance
        else:
            if self.balance  > amount + + self.withdraw_fee:
                self.balance -= amount + self.withdraw_fee
                return self.balance
                
            else:
                return "Insufficient funds"

#Lab 07

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def distance_to_origin(self):
        return (self.x *2 + self.y *2) *0.5
    def euclidean_distance(self, other):
        return ((self.x - other.x) *2 + (self.y - other.y) *2) *0.5
    def manhattan_distance(self, other):
        return abs(self.x - other.x) + abs(self.y - other.y)
    def angle_between(self, other):
        vert = other.y - self.y
        horiz = other.x - self.x
        return math.atan2(vert, horiz)

class Triangle: #uncorrected

    def __init__(self, p1, p2, p3):
        self.p1, self.p2, self.p3 = p1, p2, p3
        self.angle_ = Point()

    def side_lengths(self):
        a = math.sqrt((self.p3[0] - self.p2[0])**2 + (self.p3[1] - self.p2[1])**2)
        b = math.sqrt((self.p3[0] - self.p1[0])**2 + (self.p3[1] - self.p1[1])**2)
        c = math.sqrt((self.p2[0] - self.p1[0])**2 + (self.p2[1] - self.p1[1])**2)                 
        return (a ,b, c) #return (str(a), str(b), str(c))?
    
    def angles(self):
        a1 = self.p1.angle_between(self.p2)
        a2 = self.p1.angle_between(self.p3)
        a3 = self.p2.angle_between(self.p3)
        return (a1, a2, a3)
    
    def side_classification(self):
        if self.side_lengths(self.p1) == self.side_lengths(self.p2) == self.side_lengths(self.p3):
            return "equilateral"
        elif self.side_lengths(self.p1) == self.side_lengths(self.p2) or self.side_lengths(self.p1) == self.side_lengths(self.p3) or self.side_lengths(self.p2) == self.side_lengths(self.p3):
            return "isoceles"
        else: return "scalene"

    def angle_classification(self):
        if self.angles(self.p1) > 90 or self.angles(self.p2) > 90 or self.angles(self.p3) > 90:
            return "obtuse"
        elif self.angles(self.p1) == 90 or self.angles(self.p2) == 90 or self.angles(self.p3) == 90:
            return "right"
        elif self.angles(self.p1) == 60 and self.angles(self.p2) == 60 and self.angles(self.p3) == 60:
            return "equiangular"
        elif self.angles(self.p1) < 90 and self.angles(self.p2) < 90 and self.angles(self.p3) < 90:
            return "acute"
        
    def is_right(self):
        if self.angle_classification() == "right":
            return True
        else: False

    def area(self):
        s = (self.side_lengths(self.p1) + self.side_lengths(self.p2) + self.side_lengths(self.p3)) / 2
        return math.sqrt(s*(s-self.side_lengths()[0])*(s-self.side_lengths()[1])*(s - self.side_lengths()[2]))
    
    def perimeter(self):
        return (self.side_lengths()[0] + self.side_lengths()[1] + self.side_lengths()[2])

#Lab 08

def count_occurrences(t, n, x):
    """Return the number of times that x is equal to one of the
    first n elements of iterator t.
    >>> s = iter([10, 9, 10, 9, 9, 10, 8, 8, 8, 7])
    >>> count_occurrences(s, 10, 9)
    3
    >>> s2 = iter([10, 9, 10, 9, 9, 10, 8, 8, 8, 7])
    >>> count_occurrences(s2, 3, 10)
    2
    >>> s = iter([3, 2, 2, 2, 1, 2, 1, 4, 4, 5, 5, 5])
    >>> count_occurrences(s, 1, 3) # Only iterate over 3
    1
    >>> count_occurrences(s, 3, 2) # Only iterate over 2, 2, 2
    3
    >>> list(s) # Ensure that the iterator has advanced the right amount
    [1, 2, 1, 4, 4, 5, 5, 5]
    >>> s2 = iter([4, 1, 6, 6, 7, 7, 6, 6, 2, 2, 2, 5])
    >>> count_occurrences(s2, 6, 6)
    2
    """
    result = 0
    while n > 0:
        if next(t) == x:
            result += 1
        n -= 1    
    return result   

def repeated(t, k):
    """Return the frst value in iterator t that appears k times in a row,
    calling next on t as few times as possible.
    >>> s = iter([10, 9, 10, 9, 9, 10, 8, 8, 8, 7])
    >>> repeated(s, 2)
    9
    >>> s2 = iter([10, 9, 10, 9, 9, 10, 8, 8, 8, 7])
    >>> repeated(s2, 3)
    8
    >>> s = iter([3, 2, 2, 2, 1, 2, 1, 4, 4, 5, 5, 5])
    >>> repeated(s, 3)
    2
    >>> repeated(s, 3)
    5
    >>> s2 = iter([4, 1, 6, 6, 7, 7, 8, 8, 2, 2, 2, 5])
    >>> repeated(s2, 3)
    2
    """
    assert k > 1
    current_num = next(t)
    count = 1
    while k > 1:
        second_num = next(t)
        if current_num == second_num:
            count += 1
        if current_num != second_num:
            count = 1
        if count == k:
            return current_num
        current_num = second_num

def matches(a, b):
    """Return the number of values k such that A[k] = B[k].
    >>> matches([1, 2, 3, 4, 5], [3, 2, 3, 0, 5])
    3
    >>> matches("abdomens", "indolence")
    4
    >>> matches("abcd", "dcba")
    0
    >>> matches("abcde", "edcba")
    1
    >>> matches("abcdefg", "edcba")
    1
    """

    a = iter(a)
    b = iter(b)
    l = zip(a, b)
    counter = 0

    for a1, b1 in l:
        if a1 == b1:
            counter += 1
    return counter

def palindrome(s):

    """Return whether s is the same sequence backward and forward.
    >>> palindrome([3, 1, 4, 1, 5])
    False
    >>> palindrome([3, 1, 4, 1, 3])
    True
    >>> palindrome('seveneves')
    True
    >>> palindrome('seven eves')
    False
    """
    l = len(s)
    s1 = s
    s2 = s[::-1]
    g = zip(s1, s2)

    for p in g:
        p = iter(p)
        if next(p) != next(p):
            return False
        
    return True

def generate_constant(x):

    """A generator function that repeats the same value x forever.
    >>> two = generate_constant(2)
    >>> next(two)
    2
    >>> next(two)
    2
    >>> sum([next(two) for _ in range(100)])
    200
    """

    while True:
        yield x

def black_hole(seq, trap):
    """A generator that yields items in seq until one of them matches trap, in
    which case that value should be repeatedly yielded forever.
    >>> trapped = black_hole([1, 2, 3], 2)
    >>> [next(trapped) for _ in range(6)]
    [1, 2, 2, 2, 2, 2]
    >>> list(black_hole(range(5), 7))
    [0, 1, 2, 3, 4]
    """

    seq = iter(seq)
    item = next(seq)
    
    try:
        
        while item != trap:
            yield item
            item = next(seq)
        
        while True:
            yield trap 

    except StopIteration:
        pass

def filter_iter(iterable, f):
    """
    Generates elements of iterable for which f returns True.
    >>> is_even = lambda x: x % 2 == 0
    >>> list(filter_iter(range(5), is_even))
    [0, 2, 4]
    >>> all_odd = (2*y-1 for y in range(5))
    >>> list(filter_iter(all_odd, is_even))
    []
    >>> naturals = (n for n in range(1, 100))
    >>> s = filter_iter(naturals, is_even)
    >>> next(s)
    2
    >>> next(s)
    4
    """
    
    for elem in iterable:
        if f(elem) == True:
            yield elem

def differences(it):

    """
    Yields the differences between successive terms of iterable it.
    >>> d = differences(iter([5, 2, -100, 103]))
    >>> [next(d) for _ in range(3)]
    [-3, -102, 203]
    >>> list(differences([1]))
    []
    """
    
    

    try:
        it = iter(it)
        current = next(it)
        second = next(it)
        while it:
            yield second - current
            current = second
            second = next(it)

    except StopIteration:
        pass

#Lab 09
    
def sort_unsorted(L):
    """
    >>> sort_unsorted([3, 2, 4, 1])
    False
    >>> sort_unsorted([1, 3, 5, 7])
    True
    """
    

    while len(L) != 1:
        if L[0] <= L[1]:
            L = L[1::]
        else:
            return False
    return True

def bubble_sort(L):
    """
    bubble_sort([3, 2, 4, 1, 6, 2])
    [1, 2, 2, 3, 4, 6]
    >>> bubble_sort([1, 3, 5, 7])
    [1, 3, 5, 7]
    """
    x = 0
    y = 1

    while y != len(L):
        if L[x] > L[y]:
            L.insert(L[y], x)
            # x += 1
            # y += 1
        else:
            x += 1
            y += 1

    return L
