package io.techleadacademy._002_Variables;

public class _03 {
    /**
     * INSTANCE VARIABLES are non-static variables that are declared inside a class but outside any method.
     * They are part of the object’s state and are created when an object of the class is instantiated.
     * They are destroyed when the object is destroyed.
     */
    String model;  // Instance variable
    int year;      // Instance variable

    _03 obj1 = new _03();
    _03 obj2 = new _03();

    /**
     * STATIC VARIABLES are declared as static, meaning they belong to the class rather than to any
     * particular object instance. Only one copy of a static variable exists, regardless
     * of how many instances of the class exist.
     */
    static int numberOfCars = 0; // Static variable

    public _03() {
        numberOfCars++;
    }
}
