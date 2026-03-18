package com.learning.codingproblems.charAndString;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check Palindrome");
        String input = scanner.nextLine();
        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;
        while(start < end){
            if(input.charAt(start) != input.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
}
