package com.learning.codingproblems.charAndString;

/*
Program that counts how many times each character appears in a string
Input: banana
Output:
b -> 1
a ->3
n -> 2
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to find character frequency");
        String input = scanner.nextLine();
        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
        for(char c: input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}