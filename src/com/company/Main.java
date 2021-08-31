package com.company;

public class Main {

    public static void main(String[] args) {
        UserValidation userValidation = new UserValidation();
        UserValidation1 userValidation1 = new UserValidation1();
        //Dependency Injection
        UserService userService = new UserService(userValidation);
        UserService userService1 = new UserService(userValidation1);
        userService.saveUser("admin");
        userService1.saveUser("admin");
    }
}
