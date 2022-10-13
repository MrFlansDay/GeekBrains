# Создайте программу для игры с конфетами человек против человека.
#
# Условие задачи: На столе лежит 2021 конфета. Играют два игрока делая ход друг после друга.
# Первый ход определяется жеребьёвкой. За один ход можно забрать не более чем 28 конфет.
# Все конфеты оппонента достаются сделавшему последний ход.
# Сколько конфет нужно взять первому игроку, чтобы забрать все конфеты у своего конкурента?
#
# a) Добавьте игру против бота
#
# b) Подумайте как наделить бота ""интеллектом""

from random import randint


def input_dat(name):
    x = int(input(f"{name}, enter the number of sweets, from 1 to 28: "))
    while x < 1 or x > 28:
        x = int(input(f"{name}, enter the correct amount of sweets: "))
    return x


def p_print(name, k, counter, value):
    print(f"{name} turn, he took {k}, in general he has {counter}. There are {value} sweets left on the table")


player1 = input("Enter the name of the first player: ")
player2 = input("Enter the name of the second player: ")
value = 2021
turn = randint(0, 2)
if turn:
    print(f"Turn {player1}")
else:
    print(f"Turn {player2}")

player1_counter = 0
player2_counter = 0

while value > 28:
    if turn:
        k = input_dat(player1)
        player1_counter += k
        value -= k
        turn = False
        p_print(player1, k, player1_counter, value)
    else:
        k = input_dat(player2)
        player2_counter += k
        value -= k
        turn = True
        p_print(player2, k, player2_counter, value)

if turn:
    print(f"{player1} wins")
else:
    print(f"{player2} wins")
