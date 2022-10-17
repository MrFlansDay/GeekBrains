import work_file as wf


def filter_by_course(course):
    database = wf.read()
    for i in database:
        if i[3] == course:
            print(i[0], i[1], i[2], i[3], i[4])


def filter_by_direction(direction):
    database = wf.read()
    for i in database:
        if i[3] == direction:
            print(i[0], i[1], i[2], i[3], i[4])
