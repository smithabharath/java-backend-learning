package com.learning.codingproblems.charAndString;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedChar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to find first repeated character");
        String input = scanner.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(char c: input.toCharArray()){
            if(!set.add(c)){
                System.out.println("First repeated character is :"+c);
                break;
            }
        }
        scanner.close();
    }
}
