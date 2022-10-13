# Задайте список из нескольких чисел. Напишите программу, которая найдёт
# сумму элементов списка, стоящих на нечётной позиции.
#
# Пример:
#
# - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

list_nums = [2, 3, 5, 9, 3]
sum = 0
if len(list_nums) > 1:
    for i in range(1, len(list_nums), 2):
        sum += list_nums[i]
print(sum)


print()
# Напишите программу, которая найдёт произведение пар чисел списка.
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.
#
# Пример:
#
# - [2, 3, 4, 5, 6] => [12, 15, 16];
# - [2, 3, 5, 6] => [12, 15]

list_nums = [2, 3, 4, 5, 6]
multiply_nums = []
start_index = 0
end_index = len(list_nums) - 1
while start_index <= end_index:
    multiply_nums.append(list_nums[start_index] * list_nums[end_index])
    start_index += 1
    end_index -= 1
print(multiply_nums)


print()
# Задайте список из вещественных чисел. Напишите программу,
# которая найдёт разницу между максимальным и минимальным значением дробной части элементов.
#
# Пример:
#
# - [1.1, 1.2, 3.1, 5, 10.01] => 0.19

fract_nums = [1.1, 1.2, 3.1, 5, 10.01]
max_fraction = fract_nums[0] % 1
min_fraction = fract_nums[0] % 1
for i in range(len(fract_nums)):
    fract = fract_nums[i] % 1
    if fract > max_fraction:
        max_fraction = fract
    if fract < min_fraction and fract != 0:
        min_fraction = fract
print(round(max_fraction - min_fraction, 5))


print()
# Напишите программу, которая будет преобразовывать десятичное число в двоичное.
#
# Пример:
#
# - 45 -> 101101
# - 3 -> 11
# - 2 -> 10

bin_num_str = ""
num = int(input("Enter the number: "))
if num == 0:
    bin_num_str = "0"
while num > 0:
    bin_num_str += str(num % 2)
    num //= 2
bin_num_str = "".join(reversed(bin_num_str))
print(bin_num_str)


print()
# Задайте число. Составьте список чисел Фибоначчи, в том числе для отрицательных индексов.
#
# Пример:
#
# - для k = 8 список будет выглядеть так: [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21]


def fibonacci(k):
    if k == 0:
        return 0
    if k == 1 or k == 2:
        return 1
    if k < 0:
        return pow(-1, abs(k) + 1) * fibonacci(abs(k))
    return fibonacci(k - 1) + fibonacci(k - 2)


k = int(input("Enter the number: "))
fibonacci_list = []
for i in range(-k, k + 1):
    fibonacci_list.append(fibonacci(i))
print(fibonacci_list)
