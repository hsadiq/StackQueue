package com.bl.Stack;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        queue.push(56);
        queue.push(30);
        queue.push(70);

        System.out.print(queue);

        while(!queue.isEmpty()){
            System.out.println("Dequeue Element: " + queue.pop());
            System.out.println("Current Element: " + queue);
        }
    }
}
