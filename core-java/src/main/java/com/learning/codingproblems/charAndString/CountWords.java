package com.learning.codingproblems.charAndString;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line to count words in it");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        System.out.println(words.length);
        scanner.close();
    }
}
