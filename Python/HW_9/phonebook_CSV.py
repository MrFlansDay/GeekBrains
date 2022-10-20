def creating():
    file = 'Phonebook.csv'
    with open(file, 'w', encoding='utf-8') as data:
        data.write(f'Surname;Name;Phone number;Description\n')
