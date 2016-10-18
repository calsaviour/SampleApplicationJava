package com.javacodegeeks;

import datastructures.Node;
import datastructures.Stack.*;

import java.util.*;
import java.util.Stack;

/**
 * Hello world!
 */
public class App {

    public static void randomNote() {

        String magazine = "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x";
        String note = "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o";

        Map<String, Integer> magazineMap;
        Map<String, Integer> noteMap;

        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();

        for (String s : magazine.split("\\s+")) {
            if (!magazineMap.containsKey(s)) {
                magazineMap.put(s, 1);
            } else {
                int count = magazineMap.get(s);
                count++;
                magazineMap.put(s, count);
            }
        }

        for (String n : note.split("\\s+")) {
            if (!noteMap.containsKey(n)) {
                noteMap.put(n, 1);
            } else {
                int count = noteMap.get(n);
                count++;
                noteMap.put(n, count++);
            }
        }


        Set<String> noteKeys = noteMap.keySet();
        for (String noteKey : noteKeys) {
            int value = noteMap.get(noteKey);
            if (magazineMap.containsKey(noteKey)) {
                int magazineValues = magazineMap.get(noteKey);
                if (value > magazineValues) {
                    System.out.println("False");
                }
            }
        }
        System.out.println("True");

    }

    public static void anagram() {
        String sentences = "cde";
        String senteces2 = "abc";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : sentences.toCharArray()) {
            int ct = map.containsKey(c) ? map.get(c) : 0;
            map.put(c, (ct + 1));
        }

        for (char ch : senteces2.toCharArray()) {
            int ct = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, (ct - 1));
        }

        List<Integer> values = new ArrayList<Integer>(map.values());
        int total = 0;
        for (Integer v : values) {
            total += Math.abs(v);
        }

        System.out.println(total);
    }

    private static boolean balanceBracket() {
        String expression = "{[(])}";
        Stack<Character> stack = new Stack<Character>();
        for (char c : expression.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;

            } else if (c == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;

            } else if (c == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }

    private static void StackDemo() {
        datastructures.Stack<Integer> stack = new datastructures.Stack<Integer>();

    }


    private static void TreeDemo() {
        Node root = new Node(10);
        root.insert(8);
        root.insert(12);
        root.insert(14);
        root.insert(7);
        root.insert(9);
        root.printInOrder();
        System.out.println();
        root.printPreOrder();
        System.out.println();
        root.printPostOrder();
    }

    public static void main(String[] args) {
        //System.out.println( "Hello World!" );
        //randomNote();
        //balanceBracket();
        TreeDemo();
    }
}
