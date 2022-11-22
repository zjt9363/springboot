package com.zarrow.controller;

import com.zarrow.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    /*@RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody*/
    @PostMapping("")
    public String save(){
        System.out.println("User save");
        return "User save";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("Delete " + id);
        return "Delete" + id;
    }
}
