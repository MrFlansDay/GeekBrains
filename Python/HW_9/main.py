from telegram import Update
from telegram.ext import ApplicationBuilder, CommandHandler, MessageHandler, filters
from bot_command import *

app = ApplicationBuilder().token("5741635388:AAFowIbkrvtI1KaOQhvS-pF-qte6KXWTdSs").build()

app.add_handler(CommandHandler("hello", hello))
app.add_handler(CommandHandler("import", data_import))
app.add_handler(CommandHandler("export", data_export))
app.add_handler(MessageHandler(filters.TEXT, calcul))

app.run_polling()

