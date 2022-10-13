

# Напишите программу, удаляющую из текста все слова, содержащие ""абв"".

with open("1.txt", "r", encoding="utf8") as file:
    txt = file.read() + " "
    print(txt)
    find_txt = "абв"
    words = [i for i in txt.split() if find_txt not in i]

with open("1.1.txt", "w", encoding="utf8") as file:
    file.write(' '.join(words))

print(words)


print()
# Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных.


def encode(txt):
    encoding = ""
    i = 0
    while i < len(txt):
        count = 1
        while i + 1 < len(txt) and txt[i] == txt[i + 1]:
            count = count + 1
            i = i + 1
        encoding += str(count) + txt[i]
        i = i + 1
    return encoding


def decoding(txt):
    number = ''
    res = ''
    for i in range(len(txt)):
        if not txt[i].isalpha():
            number += txt[i]
        else:
            res = res + txt[i] * int(number)
            number = ''
    return res


with open("2.txt", "r") as file:
    txt = file.read()

print(encode(txt))
print(decoding(encode(txt)))

with open("2.1.txt", "w") as file:
    file.write(encode(txt))
