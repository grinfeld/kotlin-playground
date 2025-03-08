package com.mikerusoft.kotlin

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient

@Configuration
class Conf {
    @Bean
    fun restClient(): RestClient = RestClient.create()
}