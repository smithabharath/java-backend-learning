package com.learning.codingproblems.charAndString;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to print compressed string");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i=1;i<=input.length();i++){
            if(i< input.length() && input.charAt(i) == input.charAt(i-1)){
                count++;
            }else{
                result.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }
        System.out.println("Result :"+result);
        scanner.close();
    }
}
