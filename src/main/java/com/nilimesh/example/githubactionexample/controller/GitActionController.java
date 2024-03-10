package com.nilimesh.example.githubactionexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitActionController {
    @GetMapping("/getmessage")
    public String getMessage(){
        return "Thank you for using me! ";
    }
}
