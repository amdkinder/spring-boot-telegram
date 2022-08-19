package com.example.demo.controller

import com.example.demo.MyBotController
import com.github.kshashov.telegram.api.MessageType
import com.github.kshashov.telegram.api.bind.annotation.BotController
import com.github.kshashov.telegram.api.bind.annotation.BotRequest
import com.pengrad.telegrambot.model.Chat
import com.pengrad.telegrambot.model.Message
import com.pengrad.telegrambot.model.User
import com.pengrad.telegrambot.request.SendMessage
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@BotController
@Component
class DefaultController: MyBotController() {

    private val log = LoggerFactory.getLogger(this.javaClass)


    @BotRequest(type = [MessageType.ANY])
    fun defaultMessageHandler(chat: Chat, user: User, message: Message): SendMessage {
        log.info("request bot handler chat: $chat, user: $user, message: $message")
        val botAnswer = resolver(message.text())
        return SendMessage(chat.id(), botAnswer)
    }


    fun resolver(content: String?): String? {
        return when(content) {
            null -> "Sizni tushunmadim!"
            "salom" -> "Assalomu alaykum"
            "yaxshimisan" -> "Yaxshi rahmat, uydegilariz yaxshimi?"
            "bor yuqol" -> "qayerga yuqolay"
            "bopti hayr" -> "yaxshi qoling"
            else -> getAnswers()[content]
        }
    }

    private fun getAnswers(): Map<String, String> {
        return mapOf(
            "tuzumi" to "buvotti"
        )
    }
}