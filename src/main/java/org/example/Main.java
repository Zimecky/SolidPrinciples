package org.example;

import org.example.srp.examples.bad.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("szymon@test.email","pass");
    }
}