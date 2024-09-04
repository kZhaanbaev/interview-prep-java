package io.techleadacademy._003_Casting;

public class _01 {
    public static void main(String[] args) {
        /**
         * IMPLICIT CASTING is automatically done by the Java compiler when converting a smaller primitive type
         * to a larger primitive type. This casting is safe because there is no loss of data.
         *
         * Order of Widening Casting:
         * byte → short → int → long → float → double
         */
        int num1 = 100;
        double doubleNum1 = num1;  // Automatic (implicit) casting: int to double

        System.out.println("Integer: " + num1);       // Output: Integer: 100
        System.out.println("Double: " + doubleNum1);  // Output: Double: 100.0


        /**
         * EXPLICIT CASTING requires manual conversion when you want to convert a larger primitive type
         * to a smaller primitive type. This casting can lead to data loss if the value exceeds
         * the range of the target type.
         *
         * Order of Narrowing Casting:
         * double → float → long → int → short → byte
         */

        double doubleNum2 = 100.5;
        int num2 = (int) doubleNum2;  // Manual narrowing casting: double to int

        System.out.println("Double: " + doubleNum2);  // Output: Double: 100.5
        System.out.println("Integer: " + num2);       // Output: Integer: 100
    }
}
