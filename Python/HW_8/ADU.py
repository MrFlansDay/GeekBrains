import work_file as wf


def add(name, surname, phone, course, direction):
    wf.write([name, surname, phone, course, direction])


def update(name, surname, phone, course, direction):
    database = wf.read()
    for i in database:
        if (i[0] == name and i[1] == surname) or i[2] == phone:
            lst1 = [i[0], i[1], i[2], i[3], i[4]]
            lst2 = [name, surname, phone, course, direction]
            wf.update(' '.join(lst1), ' '.join(lst2))
            break


def delete(name, surname, phone):
    database = wf.read()
    for i in database:
        if (i[0] == name and i[1] == surname) or i[2] == phone:
            lst = [i[0], i[1], i[2], i[3], i[4]]
            wf.update(' '.join(lst), '')
            break
