package com.example.demo.controller

import com.example.demo.MyBotController
import com.github.kshashov.telegram.api.MessageType
import com.github.kshashov.telegram.api.bind.annotation.BotController
import com.github.kshashov.telegram.api.bind.annotation.BotRequest
import com.pengrad.telegrambot.model.Chat
import com.pengrad.telegrambot.model.User
import com.pengrad.telegrambot.request.SendMessage

@BotController
class CommandController: MyBotController() {


    @BotRequest(value = ["/start"], type = [MessageType.ANY])
    fun onStart(user: User, chat: Chat): SendMessage {
        return SendMessage(chat.id(), "Assalomu alaykum!!, ${user.username()}")
    }

}