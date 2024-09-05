package io.techleadacademy._006_Exceptions;

public class _02_UnCheckedExeption {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        //System.out.println(numbers[5]);  // This will cause ArrayIndexOutOfBoundsException

        try {
            System.out.println(numbers[5]);  // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }
    }
}
