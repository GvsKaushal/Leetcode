package StackProblems;

// https://www.youtube.com/watch?v=z9bJUPxzFOw

import java.util.HashMap;

public class LRUCache {

    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    HashMap<Integer, Node> hashMap = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        if (hashMap.containsKey(key)) {

            Node node = hashMap.get(key);
            remove(node);
            insert(node);

            return node.value;
        }

        return -1;
    }

    public void put(int key, int value) {
        Node newNode = new Node(key, value);

        if (hashMap.containsKey(key)) {
            Node temp = hashMap.get(key);
            temp.value = value;
            remove(temp);
            insert(temp);
        } else {
            if (capacity == hashMap.size()) {
                Node removeNode = tail.prev;
                hashMap.remove(removeNode.key);
                remove(removeNode);
                insert(newNode);
                hashMap.put(newNode.key, newNode);
            } else {
                insert(newNode);
                hashMap.put(newNode.key, newNode);
            }
        }

    }

    private void remove(Node node) {
        Node after = node.next;
        Node before = node.prev;
        before.next = after;
        after.prev = before;
    }

    private void insert(Node node) {
        Node temp = head.next;

        head.next = node;
        node.prev = head;
        node.next = temp;
        temp.prev = node;
    }
}
