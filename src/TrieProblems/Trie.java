package TrieProblems;

import java.util.HashMap;

public class Trie {

    class Node {
        public HashMap<Character, Node> children;
        public boolean isLast;

        public Node() {
            this.children = new HashMap<Character, Node>();
            this.isLast = false;
        }
    }

    private Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String word) {
        Node temp = root;
        for (char c : word.toCharArray()) {
            if (!temp.children.containsKey(c)) {
                temp.children.put(c, new Node());
            }
            temp = temp.children.get(c);
        }
        temp.isLast = true;
    }

    public boolean search(String word) {
        Node temp = root;
        for (char c : word.toCharArray()) {
            if (!temp.children.containsKey(c)) {
                return false;
            }
            temp = temp.children.get(c);
        }
        return temp.isLast;
    }

    public boolean startsWith(String prefix) {
        Node temp = root;
        for (char c : prefix.toCharArray()) {
            if (!temp.children.containsKey(c)) {
                return false;
            }
            temp = temp.children.get(c);
        }
        return true;
    }
}
