package ClassExercises.lists;

class SimpleArrayList implements SimpleList {

    private Object[] array;

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

        Object toReturn = array[removeIndex];

        Object[] newArray = new Object[array.length - 1];
        int originalIndex = 0;
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
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
