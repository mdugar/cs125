package ClassExercises.treesAndRecursion;

public class PrintLeafNodes {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new Integer[] {1, 2, 5, 8, 9});
        tree.printLeaves();

        System.out.println();

        // check with empty tree
        BinaryTree treeTwo = new BinaryTree(new Integer[] {});
        treeTwo.printLeaves();
    }
}
