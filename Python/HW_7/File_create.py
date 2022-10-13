from interface import get_info as gi

info = gi()
def writing_scv ():
    file = 'Phonebook.csv'
    with open (file, 'a', encoding = 'utf-8') as data:
        data.write(f'{info[0]};{info[1]};{info[2]};{info[3]}\n')

def writing_txt ():
    file = 'Phonebook.txt'
    with open (file, 'a', encoding = 'utf-8') as data:
        data.write(f'Surname: {info[0]}\n\nName: {info[1]}\n\nPhone number: {info[2]}\n\nDescription: {info[3]}\n\n\n')