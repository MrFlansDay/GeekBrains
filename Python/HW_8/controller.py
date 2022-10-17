import view
import ADU
import search
import filter


def start():
    while True:
        num = view.show_menu()
        if num == 1:
            search.search(input("Name: "), input("Surname: "), input("Phone: "))
        if num == 2:
            filter.filter_by_course(input("Course: "))
        if num == 3:
            filter.filter_by_direction(input("Direction: "))
        if num == 4:
            ADU.add(input("Name: "), input("Surname: "), input("Phone: "), input("Course: "), input("Direction: "))
        if num == 5:
            ADU.update(input("Name: "), input("Surname: "), input("Phone: "), input("Course: "), input("Direction: "))
        if num == 6:
            ADU.delete(input("Name: "), input("Surname: "), input("Phone: "))
        if num == 7:
            break

