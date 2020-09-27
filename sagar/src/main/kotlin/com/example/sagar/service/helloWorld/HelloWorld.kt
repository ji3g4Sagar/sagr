package com.example.sagar.service.helloWorld

import org.springframework.stereotype.Service


@Service
class HelloWorld():IHelloWorldService {

    override fun helloWorld(name: String): String {

        return ("Hello! " +name+". Have good day!")
    }
}