package com.example.demo.controller

import com.example.demo.MyBotController
import com.github.kshashov.telegram.api.bind.annotation.BotRequest
import com.pengrad.telegrambot.model.Chat
import com.pengrad.telegrambot.model.User
import com.pengrad.telegrambot.request.SendMessage
import org.springframework.stereotype.Component

@Component
class HelperController : MyBotController() {

    @BotRequest(value = ["/help", "help"])
    fun onHelp(chat: Chat, user: User): SendMessage {
        return SendMessage(chat.id(), "Biz sizga nima yordam bera olamiz")
    }


}