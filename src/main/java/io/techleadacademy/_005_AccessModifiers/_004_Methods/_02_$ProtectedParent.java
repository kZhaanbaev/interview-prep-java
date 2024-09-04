package io.techleadacademy._005_AccessModifiers._004_Methods;


public class _02_$ProtectedParent {
    /**
     * The protected access modifier allows the class members to be accessible within the same package
     * and subclasses (including subclasses in different packages).
     *
     * 	•	Class-Level: Cannot be applied to classes, only to class members (methods, variables, and constructors).
     * 	•	Member-Level: protected members are accessible within their own package and by subclasses.
     */
    protected String species;  // Accessible within the same package and by subclasses

    protected void makeSound() {  // Accessible within the same package and by subclasses
        System.out.println("Animal sound");
    }
}
