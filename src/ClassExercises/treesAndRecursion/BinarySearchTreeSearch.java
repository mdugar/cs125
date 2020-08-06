package ClassExercises.treesAndRecursion;

public class BinarySearchTreeSearch {
    public static void main(String[] args) {
        BinarySearchTree binaryTree = new BinarySearchTree(new Integer[] {2, 85, 4, 5});
        System.out.println(binaryTree.search(4));

        // check with empty tree
        BinarySearchTree treeTwo = new BinarySearchTree(new Integer[] {});
        System.out.println(treeTwo.search(5));
    }
}
