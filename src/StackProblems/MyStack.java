package StackProblems;

import java.util.LinkedList;

public class MyStack {

    private LinkedList<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.push(x);
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            queue.push(queue.remove());
        }
    }

    public int pop() {

        return queue.pop();
    }

    public int top() {

        return queue.getFirst();
    }

    public boolean empty() {

        return queue.isEmpty();
    }

    public static void main(String[] args) {

        MyStack obj = new MyStack();
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}
