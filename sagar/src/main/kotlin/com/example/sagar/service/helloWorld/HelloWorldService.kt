package com.example.sagar.service.helloWorld

import com.example.sagar.dao.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus


@Service
class HelloWorldService @Autowired constructor(
        private val  bookRepository: BookRepository
):IHelloWorldService {

    override fun helloWorld(name: String): String {

        return ("Hello! " +name+". Have good day!")
    }
}