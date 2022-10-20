from os.path import exists
from phonebook_CSV import creating
from phonebook_File_create import writing_scv
from phonebook_File_create import writing_txt


path = 'Phonebook.csv'
valid = exists(path)
if not valid:
    creating()


def start(info):
    writing_scv(info)
    writing_txt(info)
