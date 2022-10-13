# Напишите программу, которая принимает на вход цифру, обозначающую день недели,
# и проверяет, является ли этот день выходным.
#
# Пример:
#
# - 6 -> да
# - 7 -> да
# - 1 -> нет

Week_num = int(input())
if 1 <= Week_num <= 5:
    print("No")
elif Week_num == 6 or Week_num == 7:
    print("Yes")
else:
    print("Invalid number")


print()
# Напишите программу для. проверки истинности утверждения ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат.

for x in range(2):
    for y in range(2):
        for z in range(2):
            print((not (x or y or z)) == ((not x) and (not y) and (not z)))


print()
# Напишите программу, которая принимает на вход координаты точки (X и Y), причём
# X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости, в которой находится эта точка (или на какой оси она находится).
#
# Пример:
#
# - x=34; y=-30 -> 4
# - x=2; y=4-> 1
# - x=-34; y=-30 -> 3

x, y = map(int, input().split()[:2])
if x == 0 or y == 0:
    print("Error")
elif x > 0:
    if y > 0:
        print(1)
    else:
        print(4)
else:
    if y > 0:
        print(2)
    else:
        print(3)


print()
# Напишите программу, которая по заданному номеру четверти, показывает диапазон
# возможных координат точек в этой четверти (x и y).

quarter = int(input())
if 1 <= quarter <= 4:
    if quarter == 1:
        print("x > 0 and y > 0")
    elif quarter == 2:
        print("x < 0 and y > 0")
    elif quarter == 3:
        print("x < 0 and y < 0")
    elif quarter == 4:
        print("x > 0 and y < 0")
else:
    print("Error")


print()
# Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 2D пространстве.
#
# Пример:
#
# - A (3,6); B (2,1) -> 5,09
# - A (7,-5); B (1,-1) -> 7,21

x1, y1, x2, y2 = map(int, input().split()[:4])
print(round(((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5, 3))