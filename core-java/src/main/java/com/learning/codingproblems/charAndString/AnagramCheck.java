package com.learning.codingproblems.charAndString;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string 1 to check anagram");
        String input1 = scanner.nextLine();
        System.out.println("Enter string 2 to check anagram");
        String input2 = scanner.nextLine();
        input1 = input1.toLowerCase().replaceAll(" ", "");
        input2 = input2.toLowerCase().replaceAll(" ", "");
        if(input1.length() != input2.length()){
            System.out.println("Not Anagram");
        }else{
            char[] input1Arr = input1.toCharArray();
            char[] input2Arr = input2.toCharArray();
            Arrays.sort(input1Arr);
            Arrays.sort(input2Arr);

            /*if(Arrays.equals(input1Arr, input2Arr)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");
            }*/
            String sorted1 = new String(input1Arr);
            String sorted2 = new String(input2Arr);
            if(sorted1.equals(sorted2)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }
        scanner.close();
    }
}
