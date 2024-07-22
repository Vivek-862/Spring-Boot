package com.springboot.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("m")
    public static String myMethod(){
        return "Coding Wallah Sir";
    }

    @GetMapping("process-form")
    public static String getData(@RequestParam int num1,@RequestParam int num2){
        int res= num1+num2;

        return String.valueOf(res);
    }
    
}
