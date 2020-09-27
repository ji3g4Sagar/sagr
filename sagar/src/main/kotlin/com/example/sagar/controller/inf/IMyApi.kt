package com.example.sagar.controller.inf


import com.example.sagar.controller.path.MyPath.TEST_API
import com.example.sagar.controller.path.MyPath.BASE_PATH
import com.example.sagar.controller.path.MyPath.GET_BOOK
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@RequestMapping(BASE_PATH)
interface IMyApi {

    @GetMapping(
            value = [TEST_API]

    )
    fun hello(name: String): String



    @GetMapping(
            value = [GET_BOOK]
    )
    fun getBook(
            bookId: String?,
            name: String?,
            author: String?
    )
}