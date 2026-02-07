# SOLID Principles in Java

This repository demonstrates examples of the SOLID principles implemented in Java.

## Description

SOLID is a set of five object-oriented design principles that help developers create readable, flexible, and maintainable code.

## SOLID Principles

1. **Single Responsibility Principle (SRP)**  
   A class should have only one reason to change.

2. **Open/Closed Principle (OCP)**  
   Classes should be open for extension but closed for modification.
3. **Liskov Substitution Principle (LSP)**
      Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

4. **Interface Segregation Principle (ISP)** Clients should not be forced to depend on interfaces they do not use. Instead of one large, general-purpose interface, use several smaller, specific interfaces so that implementing classes only need to implement the methods that are relevant to them. This leads to more maintainable and flexible code.
5. **Dependency Inversion Principle (DIP)** High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions. This principle helps to reduce coupling between different parts of the code and makes the system more flexible and easier to maintain.