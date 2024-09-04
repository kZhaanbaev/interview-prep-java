package io.techleadacademy._005_AccessModifiers._004_Methods;


public class _02_ProtectedChild extends _02_$ProtectedParent {
    public void bark() {
        makeSound();  // Allowed because bark() is in a subclass of Animal
        System.out.println("Dog barks");
    }
}
