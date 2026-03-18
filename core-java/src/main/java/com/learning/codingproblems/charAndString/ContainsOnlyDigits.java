package com.learning.codingproblems.charAndString;

import java.util.Scanner;

public class ContainsOnlyDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check only digits");
        String input = scanner.nextLine();
        boolean isOnlyDigit = input.replaceAll("\\s", "").matches("\\d+");
        System.out.println(isOnlyDigit);
        scanner.close();
    }
}
