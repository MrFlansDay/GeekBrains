
def writing_scv(info):
    file = 'Phonebook.csv'
    with open(file, 'a', encoding='utf-8') as data:
        data.write(f'{info[0]};{info[1]};{info[2]};{info[3]}\n')


def writing_txt(info):
    file = 'Phonebook.txt'
    with open(file, 'a', encoding='utf-8') as data:
        data.write(f'Surname: {info[0]}\n\nName: {info[1]}\n\nPhone number: {info[2]}\n\nDescription: {info[3]}\n\n\n')
