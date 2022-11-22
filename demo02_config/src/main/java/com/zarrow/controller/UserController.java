package com.zarrow.controller;

import com.zarrow.DataSource;
import com.zarrow.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${country}")
    String country;

    @Value("${user1.name}")
    String name;

    @Value("${likes[1]}")
    String like;

    @Value("${tempDir}")
    String tempDir;

    @Autowired
    private Environment env;

    @Autowired
    private DataSource dataSource;

    @GetMapping
    public String getById(){
        System.out.println("SpringBoot is running");
        System.out.println("country: " + country);
        System.out.println("name: " + name);
        System.out.println("like: " + like);
        System.out.println("tempDir: " + tempDir);

        System.out.println("<----------------------分割线------------------------------->");
        //使用自动装配读取数据
        System.out.println("Autowired country: " + env.getProperty("country"));

        System.out.println("<----------------------分割线------------------------------->");
        System.out.println(dataSource);

        return "SpringBoot is running .......";
    }
}
