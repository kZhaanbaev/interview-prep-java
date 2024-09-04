package io.techleadacademy._005_AccessModifiers._004_Methods;


import org.junit.Test;

class _03_Default { // Default access, only accessible within the 'same' package
    /**
     * The default access modifier (also called package-private) is the modifier used when no access
     * modifier is specified. Members with default access are accessible only within the
     * same package and not from outside the package.
     *
     * 	•	Class-Level: A class with default access is accessible only to other classes in the same package.
     * 	•	Member-Level: Members are accessible only within their own package.
     */
    String color;  // Default access, only accessible within the 'animals' package

    void fly() {  // Default access, only accessible within the 'animals' package
        System.out.println("Bird is flying");
    }
}
