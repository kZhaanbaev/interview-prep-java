package io.techleadacademy._002_Variables;

import java.util.Date;

public class _02 {
    public static void main(String[] args) {
        /**
         * PRIMITIVE VARIABLES are the most basic data types in Java. Java has eight primitive data types:
         *
         * 	•	int (integer): 32-bit signed two’s complement integer. Example: int count = 10;
         * 	•	byte: 8-bit signed integer. Example: byte b = 22;
         * 	•	short: 16-bit signed integer. Example: short s = 1024;
         * 	•	long: 64-bit signed integer. Example: long l = 123456789L;
         * 	•	float: 32-bit floating point. Example: float f = 5.75f;
         * 	•	double: 64-bit floating point. Example: double d = 19.99;
         * 	•	char: 16-bit Unicode character. Example: char c = 'A';
         * 	•	boolean: Represents one bit of information: true or false. Example: boolean isJavaFun = true;
         */

        //REFERENCE VARIABLES are used to refer to objects. They are declared to be of a specific type, which can be any class type.
        String name = "John Doe"; // String is a class in Java
        Date today = new Date();  // Date is a class from java.util package
    }

    /**
     * LOCAL VARIABLES are declared inside a method, constructor, or block.
     * They are created when the block in which they are declared is executed, and destroyed once the block is exited.
     * Local variables do not have a default value, so they must be initialized before use.
     */
    public void sampleMethod() {
        int x = 10; // Local variable
        System.out.println(x);
    }
}
