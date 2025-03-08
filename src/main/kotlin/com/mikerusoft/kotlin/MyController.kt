package com.mikerusoft.kotlin

import org.springframework.core.ParameterizedTypeReference
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestClient

@RestController
class MyController(val restClient: RestClient) {

    @GetMapping("/hello")
    fun listMessages(): Map<String, Any>? = mapOf("a" to "b", "c" to "d")

    val mapRefType = object : ParameterizedTypeReference<Map<String, Any>>() {}

    fun remote(): Map<String, Any>? =
        restClient.get()
            .retrieve().body(mapRefType)
}