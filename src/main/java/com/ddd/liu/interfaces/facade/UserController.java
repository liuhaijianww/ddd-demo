package com.ddd.liu.interfaces.facade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @GetMapping("/test")
    public Object test(){
        return "hello world!";
    }
}
