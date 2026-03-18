package com.learning.codingproblems.charAndString;

import java.util.Scanner;

public class CheckStringRotation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string 1");
        String input1 = scanner.nextLine();
        System.out.println("Enter string 2");
        String input2 = scanner.nextLine();
        boolean isRotation = (input1.length() == input2.length()) && (input1 + input2).contains(input2);
        System.out.println("Is String 2 is rotation in String1 :"+isRotation);
        scanner.close();
    }
}
