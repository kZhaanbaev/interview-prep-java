package io.techleadacademy._004_Methods;


import org.junit.Test;

public class _03_Varargs {
    /**
     * Varargs (Variable Arguments): Allows a method to accept a variable number of arguments,
     * providing flexibility for method calls.
     */
    public void printNumbers(int... numbers) {  // Varargs parameter
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void test01() {
        _03_Varargs example = new _03_Varargs();
        example.printNumbers(1, 2, 3, 4, 5);  // Can pass multiple integers
    }
}
