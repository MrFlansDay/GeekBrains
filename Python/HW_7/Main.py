from os.path import exists
from CSV import creating
from File_create import writing_scv
from File_create import writing_txt


path = 'Phonebook.csv'
valid = exists(path)
if not valid:
    creating()

writing_scv()
writing_txt()