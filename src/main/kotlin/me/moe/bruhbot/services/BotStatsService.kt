package me.moe.bruhbot.services

import me.moe.bruhbot.dataclasses.Configuration
import me.moe.bruhbot.util.timeToString
import me.jakejmattson.discordkt.api.Discord
import me.jakejmattson.discordkt.api.annotations.Service
import java.util.*

@Service
class BotStatsService(private val configuration: Configuration, private val discord: Discord) {
    private var startTime: Date = Date()

    val uptime: String
        get() = timeToString(Date().time - startTime.time)

    val ping: String
        get() = "${discord.api.gateway.averagePing}"
}