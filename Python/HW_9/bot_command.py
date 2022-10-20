from telegram import Update
from telegram.ext import ApplicationBuilder, CommandHandler, ContextTypes, MessageHandler, filters
import calc
import phonebook

async def hello(update: Update, context: ContextTypes.DEFAULT_TYPE) -> None:
    await update.message.reply_text(f'Hello {update.effective_user.first_name}\n '
                                    f'1. Enter an expression like "11 + 5" or "(4 + 5j) + (12 + 3j)\n'
                                    f'2. Print "/import Surname Name Phone Description" '
                                    f'to import data into the phone book or /export to export data')


async def calcul(update: Update, context: ContextTypes.DEFAULT_TYPE) -> None:
    await update.message.reply_text(calc.calk(update.message.text))


async def data_import(update: Update, context: ContextTypes.DEFAULT_TYPE) -> None:
    lst = update.message.text.split()[1:]
    phonebook.start([lst[0], lst[1], lst[2], lst[3]])
    text = " ".join(lst)
    print(text)
    await update.message.reply_text(text)


async def data_export(update: Update, context: ContextTypes.DEFAULT_TYPE) -> None:
    await context.bot.sendDocument(chat_id=update.message.chat_id, document=open("Phonebook.csv", "rb"))
    await context.bot.sendDocument(chat_id=update.message.chat_id, document=open("Phonebook.txt", "rb"))