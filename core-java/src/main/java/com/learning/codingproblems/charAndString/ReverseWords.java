package com.learning.codingproblems.charAndString;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence to reverse the words");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            char[] chars = words[i].toCharArray();
            StringBuilder word = new StringBuilder();
            for(int j=chars.length-1;j>=0;j--){
                word.append(chars[j]);
            }
            result.append(word).append(" ");
        }
        System.out.println("Result :"+result.toString().trim());
        scanner.close();
    }
}
