package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
@PostMapping("/bookedit")
public String BookEdit(){
    return "Welcome to Book Edit page";
}
@PostMapping("/bookissue")
public String BookIssue(){
    return "Welcome to Book Issue page";
}
@PostMapping("/bookdelete")
public String BookDelete(){
    return "Welcome to Book Delete page";
}
@GetMapping("/bookview")
    public String ViewAllBooks(){
    return "Welcome to View All Books page";
}

}
