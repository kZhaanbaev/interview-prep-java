package io.techleadacademy._005_AccessModifiers._004_Methods;

public class _01_Public {
    /**
     * The public access modifier is the most permissive. It allows the class, method,
     * or member to be accessed from any other class, regardless of the package.
     *
     * 	•	Class-Level: A public class is accessible from any other class in any package.
     * 	•	Member-Level: public methods, variables, and constructors can be accessed from any other class.
     */
    public String name;  // Accessible from any other class

    public void makeSound() {  // Accessible from any other class
        System.out.println("Animal sound");
    }
}
