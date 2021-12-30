package com.asc.ascblogbackend.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    /**
     * 
     * @return
     */
    @RequestMapping("/")
    public String homePage(){
        return "Welcome";
    }
}
