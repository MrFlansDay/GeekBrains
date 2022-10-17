import work_file as wf


def search(name, surname, phone):
    database = wf.read()
    for i in database:
        if (i[0] == name and i[1] == surname) or i[2] == phone:
            print(i[0], i[1], i[2], i[3], i[4])
