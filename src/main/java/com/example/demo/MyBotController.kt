package com.example.demo

import com.github.kshashov.telegram.api.TelegramMvcController
import com.github.kshashov.telegram.api.bind.annotation.BotController
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


@Component
@BotController
open class MyBotController: TelegramMvcController {
    private val log = LoggerFactory.getLogger(this.javaClass)

    @Value("\${bot.token}")
    private var token: String? = null

    override fun getToken(): String {
        return token!!
    }




}
