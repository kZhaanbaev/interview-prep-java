package io.techleadacademy._004_Methods;


import org.junit.Test;

public class _02_OverloadingVsOverriding {
    /**
     * METHOD OVERRIDING in Java is a feature that allows a subclass (child class)
     * to provide a specific implementation of a method that is already defined in its superclass (parent class).
     *
     * Key Concepts of Method Overriding
     *
     * 	1.	Inheritance: Method overriding requires a parent-child relationship between classes.
     * 	The method in the subclass overrides the method in its superclass.
     * 	2.	Same Method Signature: The method in the subclass must have the same name, return type,
     * 	and parameter list (method signature) as the method in the superclass.
     * 	3.	Run-time Polymorphism: Overriding provides run-time polymorphism, meaning that the method to be executed
     * 	is determined at runtime, based on the object type.
     * 	4.	Access Modifiers: The access level of the overriding method in the subclass cannot be more restrictive
     * 	than the overridden method in the superclass. For example, if a superclass method is declared public,
     * 	the overriding method cannot be declared protected or private.
     * 	5.	Annotations: It’s a good practice to use the @Override annotation when overriding a method.
     * 	This annotation helps prevent errors by ensuring that a method is actually overriding a method from its superclass.
     */
    class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    @Test
    public void test01() {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object

        myAnimal.makeSound(); // Output: Animal makes a sound
        myDog.makeSound();    // Output: Dog barks
    }

    /**
     * Overriding vs. Overloading
     *  - Overriding occurs when a subclass provides a specific implementation for a method that is already
     *  defined in its superclass. The method signatures (name and parameters) are identical.
     * 	- Overloading is when multiple methods have the same name but different parameter lists within the
     * 	same class (or subclass). Overloading is resolved at compile-time (compile-time polymorphism),
     * 	while overriding is resolved at runtime (runtime polymorphism).
     */
}
