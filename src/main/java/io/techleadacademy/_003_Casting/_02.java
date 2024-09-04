package io.techleadacademy._003_Casting;


import org.junit.Test;

public class _02 {
    /**
     * REFERENCE CASTING involves casting objects of one class type to another within an inheritance hierarchy.
     * This is commonly used when dealing with class inheritance and interfaces.
     */

    class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Bark");
        }
    }

    @Test
    public void test01() {
        /**
         * UPCASTING is the casting from a subclass type to a superclass type.
         * This type of casting is automatic because it is always safe,
         * a subclass object is always an instance of its superclass.
         *
         * myDog is upcast to Animal, and this happens automatically without explicit casting
         * because every Dog is an Animal.
         */

        Dog myDog = new Dog();
        Animal myAnimal = myDog;  // Upcasting (implicit casting)

        myAnimal.makeSound();  // Output: Animal sound
    }

    @Test
    public void test02() {
        /**
         * DOWNCASTING is the casting from a superclass type to a subclass type.
         * This type of casting must be done explicitly and is potentially unsafe because it can lead
         * to a ClassCastException if not done correctly. Downcasting should only be performed
         * when you are certain of the object type.
         *
         * 	- myAnimal is of type Animal, but it references a Dog object.
         * 	- The explicit downcast (Dog) myAnimal is required to access methods specific to the Dog class, such as bark().
         */

        Animal myAnimal = new Dog();  // Upcasting
        Dog myDog = (Dog) myAnimal;   // Downcasting (explicit casting)

        myDog.bark();  // Output: Bark
    }
}
