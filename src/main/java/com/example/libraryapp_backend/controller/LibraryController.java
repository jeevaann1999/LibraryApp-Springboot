package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

@PostMapping("/")
public  String AdminLogin() {
    return "Welcome to admin login page";
}
@PostMapping("/userlogin")
public String UserLogin(){
    return "Welcome to user login page";
}
@PostMapping("/userreg")
public String UserRegistration(){
    return "Welcome to user registration page";
}
@PostMapping("/bookentry")
public String BookEntry(){
    return "Welcome to Book Entry page";
}
@PostMapping("/booksearch")
public String BookSearch(){
    return "Welcome to Book Search page";
}

}
