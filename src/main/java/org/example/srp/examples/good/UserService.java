package org.example.srp.examples.good;

public class UserService {

    private final UserValidator validator = new UserValidator();
    private final UserRepository repository = new UserRepository();
    private final EmailService emailService = new EmailService();

    public void registerUser(String email, String password) {
        validator.validate(email);
        repository.save(email, password);
        emailService.sendWelcomeEmail(email);
    }
}

