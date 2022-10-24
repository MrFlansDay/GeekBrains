from telegram.ext import MessageHandler, filters
from bot_command import *

app = Application.builder().token("5741635388:AAFowIbkrvtI1KaOQhvS-pF-qte6KXWTdSs").build()

app.add_handler(CommandHandler('start', start))
app.add_handler(CallbackQueryHandler(button))
app.add_handler(CommandHandler('help', help_command))
app.add_handler(MessageHandler(filters.TEXT, calcul))
app.run_polling()
