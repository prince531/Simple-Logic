package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MyClas {
    @RequestMapping("/hello")
    public static String myMethod() {
    return "Hello World";
    }
    @RequestMapping("/date")
    public Date getDate() {
    return new Date();
    }
    @RequestMapping("/oddEven/{num}")
    public static String getOddEven(@PathVariable int num){
        if(num%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    @RequestMapping("/prime/{num}")
    public static String getPrime(@PathVariable int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return num+" is prime number";
        }
        else{
            return num+" is not Prime number";
        }
    }
    @RequestMapping("/user/{name}")
    public static String getUser (@PathVariable String name){
        if(name.equalsIgnoreCase("Puja")){
            return "Welcome "+name;
        }
        else{
            return name+" Invalid User";
        }
    }
    
}
