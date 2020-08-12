/*package proficiencyPractice;

import java.util.Map;
import java.util.HashMap;

public class YourBinaryTree {

    private void traverse_tree(Node root, Map<Object, Integer> objectCountMap) {
        if(root == null) {
            return;
        }
        objectCountMap.putIfAbsent(root, 0);
        objectCountMap.put(root, objectCountMap.get(root) + 1);
        traverse_tree(root.left, objectCountMap);
        traverse_tree(root.right, objectCountMap);
    }

    protected Map<Object, Integer> valueCount()
    {
        Map<Object, Integer> objectCountMap = new HashMap<>();
        traverse_tree(root, objectCountMap);
        System.out.println(objectCountMap);
        return objectCountMap;
    }
}*/
