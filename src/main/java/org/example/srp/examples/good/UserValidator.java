package org.example.srp.examples.good;

public class UserValidator {
    public void validate(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }
}

