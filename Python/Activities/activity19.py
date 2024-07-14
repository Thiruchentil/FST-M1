import pandas
from pandas import ExcelWriter

data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
    'LastName':["Shah", "Kati", "Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)

writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

writer.save()

import pandas

dataframe = pandas.read_excel('sample.xlsx')

print(dataframe)

print("====================================")
print("Number of rows and columns:", dataframe.shape)

print("====================================")
print("Emails:")
print(dataframe['Email'])

print("====================================")
print("Sorted data:")
print(dataframe.sort_values('FirstName'))


