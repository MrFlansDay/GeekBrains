import math

# Задайте два числа. Напишите программу, которая найдёт НОК (наименьшее общее кратное) этих двух чисел.

a, b = 7, 45
lcm = 0
for i in range(max(a, b), a * b + 1):
    if i % a == 0 and i % b == 0:
        lcm = i
        break
print(lcm)


print()
# Вычислить число c заданной точностью d
#
# Пример:
#
# - при $d = 0.001, π = 3.141.$    $10^{-1} ≤ d ≤10^{-10}$

c, d = math.pi, 0.001
accuracyIndex = 0
while d % 1 != 0:
    accuracyIndex += 1
    d *= 10
print(math.trunc(c * pow(10, accuracyIndex)) / pow(10, accuracyIndex))


print()
# Задайте натуральное число N. Напишите программу, которая составит список простых множителей числа N.

N = 330
numList = []
while N > 1:
    i = 2
    while True:
        if N % i == 0:
            N = N // i
            numList.append(i)
            break
        else:
            i += 1
print(numList)


print()
# Задайте последовательность чисел.
# Напишите программу, которая выведет список неповторяющихся элементов исходной последовательности.

numbersList = [1, 1, 2, 3, 2, 5, 7, 7]
numbersSet = set(numbersList)
print(numbersSet)


print()
# Даны два файла, в каждом из которых находится запись многочлена.
# Задача - сформировать файл, содержащий сумму многочленов.


def poly1(a, b, c, res='') -> str:
    if b > 0:
        res += '+' + str(b) + '*x'
    if c > 0:
        res += '+' + str(c)
    return f'{a}*x^2' + res


def poly2(a, b, c, res='') -> str:
    if b > 0:
        res += '+' + str(b) + '*x'
    if c > 0:
        res += '+' + str(c)
    return f'{a}*x^2' + res


with open('1.txt', 'r') as f:
    list_5 = str(f.readline()).split('x')
    c1 = b1 = a1 = 0
    if len(list_5) == 3:
        c1 = list_5[2][1:]
    if len(list_5) >= 2:
        b1 = list_5[1][3:-1]
    a1 = list_5[0][:-1]


with open('2.txt', 'r') as f:
    list_51 = str(f.readline()).split('x')
    c2 = b2 = a2 = 0
    if len(list_51) == 3:
        c2 = list_51[2][1:]
    if len(list_51) >= 2:
        b2 = list_51[1][3:-1]
    a2 = list_51[0][:-1]

with open('res.txt', 'w') as f:
    f.write(poly1(int(a1) + int(a2), int(b1) + int(b2), int(c1) + int(c2)))
    print(poly2(int(a1) + int(a2), int(b1) + int(b2), int(c1) + int(c2)))
