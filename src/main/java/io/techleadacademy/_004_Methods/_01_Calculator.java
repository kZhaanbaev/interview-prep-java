package io.techleadacademy._004_Methods;

import org.junit.Test;

public class _01_Calculator {
    /**
     * INSTANCE METHODS belong to an instance of a class. To invoke an instance method, you need to create an object of the class.
     */
    public int multiply(int x, int y) {  // Instance method
        return x * y;
    }

    @Test
    public void test01(){
        _01_Calculator calc = new _01_Calculator();  // Creating an instance of Calculator
        int result = calc.multiply(4, 5);    // Calling the instance method
        System.out.println("Result: " + result);  // Output: Result: 20
    }


    /**
     * STATIC METHODS belong to the class rather than to any specific instance, so they can be called without
     * creating an instance of the class. Static methods can access static variables and other static methods directly.
     */
    public static int square(int number) {  // Static method
        return number * number;
    }

    @Test
    public void test02() {
        int result = _01_Calculator.square(5);  // Calling the static method without creating an instance
        System.out.println("Square: " + result);  // Output: Square: 25
    }


    /**
     * VOID METHODS do not return any value. They perform an action but do not send any value back to the caller.
     */
    public void sayHello() {  // Void method
        System.out.println("Hello!");
    }

    @Test
    public void test03() {
        _01_Calculator greet = new _01_Calculator();
        greet.sayHello();  // Output: Hello!
    }


    /**
     *  PARAMETERIZED METHODS can accept parameters (also known as arguments) to pass data into the method.
     *  Parameters allow methods to be more dynamic and versatile.
     */
    public void printMessage(String message) {  // Method with a parameter
        System.out.println(message);
    }

    @Test
    public void test04() {
        _01_Calculator printer = new _01_Calculator();
        printer.printMessage("Hello, Java!");  // Output: Hello, Java!
    }


    /**
     * RETURN TYPE METHODS can return a value of a specified type.
     * The return type must match the type of the value returned by the method.
     */
    public int add(int a, int b) {  // Method with a return type
        return a + b;  // Returns an integer
    }

    @Test
    public void test05() {
        _01_Calculator operations = new _01_Calculator();
        int sum = operations.add(10, 20);  // Calling the method and storing the returned value
        System.out.println("Sum: " + sum);  // Output: Sum: 30
    }
}
