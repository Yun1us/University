# `geopandas` installation on Windows 

```sh
conda create -n geopandas python=3.9
conda activate geopandas
conda install shapely -c conda-forge
conda install fiona pyproj rtree -c conda-forge
conda install descartes -c conda-forge
conda install packaging pandas numpy -c conda-forge
pip install geopandas
```

