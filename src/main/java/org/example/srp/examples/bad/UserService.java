package org.example.srp.examples.bad;

public class UserService {

    public void registerUser(String email, String password) {
        // 1. Validate input
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // 2. Save user to database
        System.out.println("Saving user to database");

        // 3. Send welcome email
        System.out.println("Sending welcome email");
    }

    /*
    Why this is bad
    This class has multiple responsibilities:
    validation logic
    persistence (database)
    email sending
    That’s 3 reasons to change:
    validation rules change
    database changes
    email logic changes
    SRP ❌ */
}
