package ClassExercises.treesAndRecursion;

public class BinarySearchTreeTraversal {
    public static void main(String[] args) {
        BinarySearchTree binaryTree = new BinarySearchTree(new Integer[] {2, 85, 4, 5});
        System.out.println(binaryTree.allValues());

        // check with empty tree
        BinarySearchTree treeTwo = new BinarySearchTree(new Integer[] {});
        System.out.println(treeTwo.allValues());
    }
}
