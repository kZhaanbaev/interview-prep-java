package io.techleadacademy._005_AccessModifiers._004_Methods;


class _03_Private { // Default access, only accessible within the 'animals' package
    /**
     * The private access modifier is the most restrictive.
     * It allows the class members to be accessed only within the class they are declared.
     *
     * 	•	Class-Level: Cannot be applied to top-level classes. (However, inner classes can be declared private.)
     * 	•	Member-Level: private members are accessible only within their own class.
     */
    private String name;  // Accessible only within the Animal class

    private void makeSound() {  // Accessible only within the Animal class
        System.out.println("Animal sound");
    }

    public void accessPrivateMethod() {
        makeSound();  // This works because it is within the same class
    }

}
