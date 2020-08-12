package ClassExercises.treesAndRecursion;

import java.util.Random;


public class BinaryTree {
    private static Random random = new Random();

    private class Node {
        private Object value;
        private Node right;
        private Node left;
        Node(Object setValue) {
            value = setValue;
        }
    }

    private Node root;

    BinaryTree(Object[] values) {
        for (Object value : values) {
            add(root, value);
        }
    }

    public void add(Object value) {
        add(root, value);
    }

    private void add(Node current, Object value) {
        if (current == null) {
            root = new Node(value);
            return;
        }
        if (random.nextBoolean()) {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                add(current.right, value);
            }
        } else {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                add(current.left, value);
            }
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node current) {
        if (current == null) {
            return 0;
        }
        return 1 + size(current.left) + size(current.right);
    }

    public String toString() {
        return toString(root);
    }

    private String toString(Node current) {
        if (current == null) {
            return "";
        }
        return "[" + current.value.toString() + "]"
                + toString(current.right) + toString(current.left);
    }

    public int sum() {
        return sum(root);
    }

    private int sum(Node current) {
        if (current == null) {
            return 0;
        }
        return (int) current.value + (int) sum(current.left) + (int) sum(current.right);
    }

    public void printLeaves() {
        printLeaves(root);
    }

    private void printLeaves(Node current) {
        if (current == null) {
            return;
        }
        if (current.left == null && current.right == null) {
            System.out.println(current.value);
            return;
        }
        printLeaves(current.left);
        printLeaves(current.right);
    }

    public boolean search(Object value) {
        return search(root, value);
    }

    private boolean search(Node current, Object value) {
        if (current == null) {
            return false;
        }
        return current.value.equals(value)
                || search(current.right, value)
                || search(current.left, value);
    }

    public boolean heightBalanced() {
        return heightBalanced(root);
    }

    private boolean heightBalanced(Node current) {
        if (current == null) {
            return true;
        }

        int lh = size(current.left);
        int rh = size(current.right);

        if (Math.abs(lh - rh) <= 1
                && heightBalanced(current.left)
                && heightBalanced(current.right)) {
            return true;
        }

        return false;
    }

    public int countLessThan(Comparable value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null.");
        }
        return countLessThan(value, root);
    }

    private int countLessThan(Comparable value, Node root) {
        if (root == null) {
            return 0;
        }
        if (root.value.compareTo(value) < 0) {
            return 1;
        }
        return countLessThan(value, root.left) + countLessThan(value, root.right);
    }
}
