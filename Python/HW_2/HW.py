import random

# Напишите программу, которая принимает на вход вещественное число и показывает сумму его цифр.
#
# Пример:
#
# - 6782 -> 23
# - 0,56 -> 11

start_num = input("Enter the number: ")
sum_elements = 0
for i in range(len(start_num)):
    if start_num[i] == ',' or start_num[i] == '.':
        continue
    else:
        sum_elements += int(start_num[i])
print(sum_elements)


print()
# Напишите программу, которая принимает на вход число N и выдает набор произведений чисел от 1 до N.
#
# Пример:
#
# - пусть N = 4, тогда [ 1, 2, 6, 24 ] (1, 1*2, 1*2*3, 1*2*3*4)

start_num = int(input("Enter the number: "))
num_product = 1
print(f"N = {start_num} => [ ", end='')
for i in range(1, start_num):
    num_product *= i
    print(f"{num_product}, ", end='')
num_product *= start_num
print(f"{num_product} ]")


print()
# Задайте список из n чисел последовательности $(1+\frac 1 n)^n$ и выведите на экран их сумму.

n = int(input('Enter number: '))
subsequence = [round((1 + 1 / x) ** x, 2) for x in range(1, n + 1)]
print(subsequence)
print(sum(subsequence))


print()
# Реализуйте алгоритм перемешивания списка.

start_list = []
mixed_list = []
list_lenth = 100
for i in range(1, list_lenth + 1):
    start_list.append(i)
for i in range(list_lenth):
    rand_index = random.randint(0, len(start_list) - 1)
    mixed_list.append(start_list[rand_index])
    start_list.pop(rand_index)
print(mixed_list)