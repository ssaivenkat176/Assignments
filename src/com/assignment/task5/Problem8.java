package com.assignment.task5;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem8 {

    private static boolean isBalanced(String s) {

        char ch[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char character : ch) {

            if (character == '(' || character == '{' || character == '[')
                map.put(character, map.getOrDefault(character, 0) + 1);
            else {
                if (character == ')') {

                    map.put('(', map.getOrDefault(character, 1) - 1);

                } else if (character == '}') {

                    map.put('{', map.getOrDefault(character, 1) - 1);


                } else if (character == ']') {

                    map.put('[', map.getOrDefault(character, 1) - 1);

                }
            }
        }
        if (map.get('(') == 0 && map.get('[') == 0 && map.get('{') == 0)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        String s1 = "({{)}[}]()";
        String s2 = "[})(";
        System.out.println(isBalanced(s1.trim())); // Output: true
        System.out.println(isBalanced(s2.trim())); // Output: false
    }
}









