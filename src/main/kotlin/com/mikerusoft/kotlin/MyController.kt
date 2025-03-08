package com.mikerusoft.kotlin

import org.springframework.beans.factory.annotation.Value
import org.springframework.core.ParameterizedTypeReference
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestClient

@RestController("/")
class MyController(val restClient: RestClient, @Value("\${server.port}") val port: Int) {

    @GetMapping("/listMessages")
    fun listMessages(): Map<String, Any>? = mapOf("a" to "b", "c" to "d")

    val mapRefType = object : ParameterizedTypeReference<Map<String, Any>>() {}

    @GetMapping("/remote")
    fun remote(): Map<String, Any>? =
        restClient.get()
            .uri("http://localhost:${port}/listMessages")
            .retrieve().body(mapRefType)
}