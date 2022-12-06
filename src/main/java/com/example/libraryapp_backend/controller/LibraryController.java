package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

@PostMapping("/")
public  String AdminLogin() {
    return "Welcome to admin login";
}
@PostMapping("/userlogin")
public String UserLogin(){
    return "Welcome to user login";
}
@PostMapping("/userreg")
public String UserRegistration(){
    return "Welcome to user registration";
}

}
