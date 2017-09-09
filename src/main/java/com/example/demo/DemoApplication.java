package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //注解 
@EnableAutoConfiguration //没改注解会报错！
public class DemoApplication {

	//运行该主函数，会自动启内置的tomcat!
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
    //localhost:8080/hello
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }
}
