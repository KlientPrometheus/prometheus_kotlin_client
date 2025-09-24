package io.github.klient.prometheus.ktorExample

import configureRouting
import io.github.klient.prometheus.ktor.installPrometheusMetrics
import io.ktor.server.application.Application
import simulateTrafficLoad

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain
        .main(args)
}

fun Application.module() {
    configureRouting()
    installPrometheusMetrics()
    simulateTrafficLoad()
}
