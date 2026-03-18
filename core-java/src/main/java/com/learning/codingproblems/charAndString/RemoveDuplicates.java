package com.learning.codingproblems.charAndString;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to remove duplicates and maintain order");
        String input = scanner.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c: input.toCharArray()){
            set.add(c);
        }
        StringBuilder result = new StringBuilder();
        for(char c: set){
            result.append(c);
        }
        System.out.println("String after removing duplicates :"+result);
        scanner.close();
    }
}
