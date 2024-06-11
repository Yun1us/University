import pandas as pd
import requests
from bs4 import BeautifulSoup


tempths = temp_table.find_all("th")

tempths_table_title = [title.text.strip() for title in tempths]
print(tempths_table_title)

def get_columm_titles(table):
    col_names = {1: [], 2: []}
    for i,j in enumerate(tempths_table_title):
        col_names[1] = tempths_table_title[:4]
        col_names[2] = tempths_table_title[4:]
    return col_names


columns = get_columm_titles(temp_table)
columns

def get_extreme_max_temperature(table):
    result = {0: [], 1: [], 2: [], 3: []}
    for i, row in enumerate(table.select('tr')[2:]):
        for j, col in enumerate(row.select('td')[0:4]):
            result[j].append(col.text.strip())
    
    df = pd.DataFrame.from_dict(result)
    df.columns = columns[2][0:4]
    return df
