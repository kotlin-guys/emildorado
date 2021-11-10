package ru.emildorado.rest

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingRest {

    private val logger = KotlinLogging.logger {  }

    @GetMapping("/ping")
    fun ping() = "ping".also {
        logger.info { "Ping!" }
    }

}