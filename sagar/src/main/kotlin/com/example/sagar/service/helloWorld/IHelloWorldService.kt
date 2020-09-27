package com.example.sagar.service.helloWorld

import org.springframework.stereotype.Service


@Service
interface IHelloWorldService {

    fun helloWorld(name: String): String

    fun getBook(bookdId: String?, bookName: String?, auth: String)
}