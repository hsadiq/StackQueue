package com.bl.Stack;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(56);
        stack.push(30);
        stack.push(70);

        System.out.print(stack + " ");
    }
}
