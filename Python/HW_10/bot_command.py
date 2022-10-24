from telegram import InlineKeyboardButton, InlineKeyboardMarkup, Update
from telegram.ext import Updater, CommandHandler, CallbackQueryHandler, Application, ContextTypes
import calc


async def log(update: Update, context: ContextTypes.DEFAULT_TYPE):
    file = open('db.csv', 'a')
    file.write(f'{update.effective_user.first_name},{update.effective_user.id}, {update.message.text}\n')
    file.close()


async def start(update, context: ContextTypes.DEFAULT_TYPE):
    await log(update, context)
    keyboard = [
        [
            InlineKeyboardButton("/Help", callback_data='help')
        ]
    ]
    reply_markup = InlineKeyboardMarkup(keyboard)
    await update.message.reply_text('Пожалуйста, выберите:', reply_markup=reply_markup)


async def button(update, context: ContextTypes.DEFAULT_TYPE):
    query = update.callback_query
    variant = query.data
    await query.answer()
    await query.edit_message_text(text=f"/{variant}")


async def calcul(update: Update, context: ContextTypes.DEFAULT_TYPE) -> None:
    await log(update, context)
    await update.message.reply_text(calc.calk(update.message.text))


async def help_command(update, context: ContextTypes.DEFAULT_TYPE):
    await log(update, context)
    await update.message.reply_text('Enter an expression like 11 + 5 or (4 + 5j) + (12 + 3j)')