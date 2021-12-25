package com.nilmani.gameproject.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {


    @GetMapping("/chek")
    fun getHome():String{
        return "Index"
    }

}