import pandas as pd

def run_analysis():
    data = pd.read_csv('data/sample.csv')
    return {'mean': data['Phone 1'].mean()}
