package com.example.sagar.controller.impl

import com.example.sagar.controller.inf.IMyApi
import com.example.sagar.controller.path.MyPath
import com.example.sagar.service.helloWorld.IHelloWorldService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class MyController @Autowired constructor(
        @Qualifier("IHelloWorldService") val helloWorld: IHelloWorldService

):IMyApi {

    override fun hello(
            @PathVariable(MyPath.NAME) name: String): String {
        return helloWorld.helloWorld(name)
    }




}