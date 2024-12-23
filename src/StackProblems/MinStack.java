package StackProblems;

// https://www.youtube.com/watch?v=8UegNFCUQks

import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            min.push(val);
        } else {
            stack.push(val);
            if (val < min.peek()) {
                min.push(val);
            } else {
                min.push(min.peek());
            }
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
