package com.bl.Stack;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(56);
        stack.push(30);
        stack.push(70);

        while (!stack.isEmpty()){
            System.out.println("Popped Element: " + stack.pop());
            System.out.println("Peeked Element: " + stack.peek());
            System.out.println("Current Element: " + stack);
        }
    }
}
