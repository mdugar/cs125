package ClassExercises.treesAndRecursion;

public class BinaryTreeExample {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new Integer[] {1, 2, 5, 8, 9});
        System.out.println(tree.size());
        System.out.println(tree);

        BinaryTree treeTwo = new BinaryTree(new Integer[] {});
        System.out.println(treeTwo.size());
    }
}
