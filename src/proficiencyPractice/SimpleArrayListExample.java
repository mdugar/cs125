package proficiencyPractice;

interface SimpleList {
    Object get(int index);
    void set(int index, Object element);
    void add(int index, Object element);
    Object remove(int index);
    int size();
}

class SimpleArrayList implements SimpleList {
    /** Internal array for storing values. */
    private Object[] array;

    /**
     * Create a list from an array of Objects.
     *
     * Copies references from the passed array so that
     * modifications to this list will not affect the original array.
     * We'll need to make copies of the array later to support add and remove,
     * so this is the right thing to do now.
     *
     * @param originalArray original array of Objects used to create the list
     */
    SimpleArrayList(Object[] originalArray) {
        if (originalArray != null) {
            array = new Object[originalArray.length];
            for (int i = 0; i < originalArray.length; i++) {
                array[i] = originalArray[i];
            }
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }
        return array[index];
    }
    public void set(int index, Object element) {
        if (index < 0 || index > array.length) {
            return;
        }
        array[index] = element;
    }

    public int size() {
        return array.length;
    }

    public Object remove(int removeIndex) {
        if (removeIndex < 0 || removeIndex >= array.length) {
            return null;
        }

        // remove returns the item being removed
        Object toReturn = array[removeIndex];

        // Create and populate our new smaller array. We use for loop syntax
        // maintaining two indices.
        Object[] newArray = new Object[array.length - 1];
        int originalIndex = 0;
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
            // Skip the spot that we are removing
            if (newIndex == removeIndex) {
                originalIndex++;
            }
            newArray[newIndex] = array[originalIndex];
            originalIndex++;
        }
        array = newArray;
        return toReturn;
    }

    public void add(int addIndex, Object toAdd) {
        if (addIndex < 0 || addIndex > array.length) {
            return;
        }

        Object[] newArray = new Object[array.length + 1];
        int originalIndex = 0;
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
            // Add object in associated spot
            if (newIndex == addIndex) {
                newArray[newIndex] = toAdd;
                newIndex++;
            }
            if(newIndex <= array.length) {
                newArray[newIndex] = array[originalIndex];
                originalIndex++;
            }
        }
        array = newArray;
    }
}

public class SimpleArrayListExample {
    public static void main(String[] args) {
        SimpleList simpleList = new SimpleArrayList(new Integer[] {1, 2, 3, 4, 5, 6});
        simpleList.add(2, 17);
        simpleList.add(simpleList.size(), 20);
        simpleList.remove(simpleList.size() - 1);
        for (int i = 0; i < simpleList.size(); i++) {
            System.out.println(simpleList.get(i));
        }
    }
}
