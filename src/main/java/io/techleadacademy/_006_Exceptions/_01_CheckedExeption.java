package io.techleadacademy._006_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _01_CheckedExeption {
    public static void main(String[] args) {
        File file = new File("non_existent_file.txt");
        //Scanner reader = new Scanner(file);

        try {
            Scanner reader2 = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
