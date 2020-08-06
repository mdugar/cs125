package ClassExercises.treesAndRecursion;

import java.util.List;
import java.util.ArrayList;

public class BinarySearchTree {
    private class Node {
        private Comparable value;
        private Node right;
        private Node left;
        Node(Comparable setValue) {
            value = setValue;
        }
    }

    private Node root;

    BinarySearchTree(Comparable[] values) {
        for (Comparable value : values) {
            add(root, value);
        }
    }

    public void add(Comparable value) {
        add(root, value);
    }

    private void add(Node current, Comparable value) {
        if (current == null) {
            root = new Node(value);
            return;
        }
        if (current.value.compareTo(value) >= 0) {
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

    public boolean search(Comparable value) {
        return search(root, value);
    }

    private boolean search(Node current, Comparable value) {
        if (current == null) {
            return false;
        }
        if (current.value.equals(value)) {
            return true;
        }
        if (current.value.compareTo(value) < 0) {
            return search(current.left, value);
        } else {
            return search(current.right, value);
        }
    }

    public List allValues() {
        List values = new ArrayList();
        allValues(root, values);
        return values;
    }

    /* converts nodes in tree recursively into a List for use in iterative method implementations */
    private void allValues(Node current, List values) {
        if (current == null) {
            return;
        }
        values.add(current.value);
        allValues(current.right, values);
        allValues(current.left, values);
    }
}
