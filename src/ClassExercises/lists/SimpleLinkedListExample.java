package ClassExercises.lists;

class SimpleLinkedList implements SimpleList {
    class Item {
        Object value;
        Item next;
        Item(Object setValue, Item setNext) {
            value = setValue;
            next = setNext;
        }
    }

    protected Item start;
    protected int size;

    public SimpleLinkedList() {
        start = null;
        size = 0;
    }

    public SimpleLinkedList(Object[] array) {
        start = null;
        size = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            this.add(0, array[i]);
        }
    }

    public Item get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        int currentIndex = 0;
        for (Item current = start; current != null; current = current.next) {
            if (currentIndex == index) {
                return current;
            }
            currentIndex++;
        }
        return null;
    }

    public void set(int index, Object value) {
        if (index < 0 || index >= size) {
            return;
        }

        int currentIndex = 0;
        for (Item current = start; current != null; current = current.next) {
            if (currentIndex == index) {
                current.value = value;
                return;
            }
            currentIndex++;
        }
        return;
    }

    public void add(int index, Object value) {
        if (index < 0 || index > size) {
            return;
        }

        if(index == 0) {
            start = new Item(value, start);
            size++;
            return;
        }

        Item current = get(index - 1);
        current.next = new Item(value, current.next);
        size++;
    }

    public Object remove(int index) {
        if(index < 0 || index >= size) {
            return null;
        }

        if(index == 0) {
            Object toReturn = start.value;
            start = start.next;
            size--;
            return toReturn;
        }

        Item current = get(index - 1);
        Object toReturn = current.next.value;
        current.next = current.next.next;
        size--;
        return toReturn;
    }

    public void printList() {
        for (Item current = start; current != null; current = current.next) {
            System.out.print(current.value + ", ");
        }
        System.out.println("");
    }

    public int size() {
        return size;
    }
}

public class SimpleLinkedListExample {
    public static void main(String[] unused) {
        SimpleLinkedList listOne = new SimpleLinkedList(new Integer[] {1, 2, 3, 90});
        listOne.printList();
        System.out.println("Size: " + listOne.size());
        listOne.add(listOne.size(),100000);
        listOne.printList();
        listOne.add(0, 0);
        listOne.printList();
        listOne.set(5, 7);
        listOne.printList();
        System.out.println("Removed Element: " + listOne.remove(0));
        System.out.println("Size: " + listOne.size());
        listOne.printList();
        System.out.println("Retrieved Value: " + listOne.get(4).value);

        System.out.println();
        SimpleLinkedList listTwo = new SimpleLinkedList();
        System.out.println("Size: " + listTwo.size());
        listTwo.add(0, 1);
        listTwo.add(1, 2);
        listTwo.add(2, 3);
        listTwo.add(3, 4);
        listTwo.printList();
        System.out.println("Size: " + listTwo.size());
        listTwo.add(4, 5);
        listTwo.printList();
        System.out.println("Size: " + listTwo.size());

    }
}
