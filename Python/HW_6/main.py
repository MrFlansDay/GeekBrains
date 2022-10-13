# Дана последовательность чисел. Получить список уникальных элементов заданной последовательности.
# Пример:
#
# [1, 2, 3, 5, 1, 5, 3, 10] => [2, 10]

start_list = [1, 2, 3, 5, 1, 5, 3, 10]
result_list = list(i for i in start_list if start_list.count(i) == 1)
print(result_list)


print()
# Напишите программу, которая принимает на вход число N и выдает набор произведений чисел от 1 до N.
#
# Пример:
#
# - пусть N = 4, тогда [ 1, 2, 6, 24 ] (1, 1*2, 1*2*3, 1*2*3*4)


def mult(n):
    num_product = 1
    for i in range(1, n+1):
        num_product *= i
    return num_product


start_num = int(input("Enter the number: "))
print(list(map(lambda x: mult(x), range(1, start_num + 1))))


print()
# Задайте список из n чисел последовательности $(1+\frac 1 n)^n$ и выведите на экран их сумму.

n = int(input('Enter number: '))
subsequence = [round((1 + 1 / x) ** x, 2) for x in range(1, n + 1)]
print(subsequence)
print(sum(subsequence))


print()
# Задайте список из нескольких чисел. Напишите программу, которая найдёт
# сумму элементов списка, стоящих на нечётной позиции.
#
# Пример:
#
# - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

list_nums = [2, 3, 5, 9, 3]
print(sum(list(list_nums[i] for i in range(0, len(list_nums)) if i % 2 == 1)))


print()
# Напишите программу, удаляющую из текста все слова, содержащие ""абв"".

txt = "пабв кгбва ддабвд ajfe"
find_txt = "абв"
words = [i for i in txt.split() if find_txt not in i]
print(words)
