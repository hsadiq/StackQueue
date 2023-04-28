package com.bl.Stack;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int data){
        stack.push(data);
    }
    public int pop(){
        return stack.pop();
    }
    public int peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
