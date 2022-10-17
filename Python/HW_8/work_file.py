def write(data: list):
    with open("database.txt", "a") as file:
        for i in data:
            file.write(i + " ")
        file.write("\n")


def update(old, new):
    with open('database.txt', 'r') as f:
        old_data = f.read()

    new_data = old_data.replace(old, new)

    with open('database.txt', 'w') as f:
        f.write(new_data)


def read():
    with open("database.txt", "r") as file:
        database = file.readlines()
        lst = []
        for i in database:
            lst.append(i.split())
    return lst
