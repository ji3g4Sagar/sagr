package com.example.sagar.service.helloWorld

import org.springframework.stereotype.Service


@Service
interface IHelloWorldService {

    fun helloWorld(name: String): String
}