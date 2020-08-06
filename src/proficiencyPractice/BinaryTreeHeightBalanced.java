package proficiencyPractice;

import proficiencyPractice.BinaryTree;

public class BinaryTreeHeightBalanced {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new Integer[] {2, 85, 4, 5});
        System.out.println(tree.heightBalanced());

        // check with empty tree
        BinaryTree treeTwo = new BinaryTree(new Integer[] {});
        System.out.println(treeTwo.heightBalanced());
    }
}
