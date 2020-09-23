package dev.henderson.mockue.mockappserver.dev.henderson.mockue.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloWorld {
    @GetMapping(path='hello')
    def @ResponseBody helloWorld() {
        return 'Hello from Mock AppServer!'
    }
}
