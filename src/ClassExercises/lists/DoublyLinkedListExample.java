package ClassExercises.lists;

class DoublyLinkedList implements SimpleList {
    class Item {
        Object value;
        Item next;
        Item previous;
        Item(Object setValue, Item setNext) {
            value = setValue;
            next = setNext;
        }
    }

    protected Item start;
    protected Item end;
    protected int size;

    public DoublyLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public DoublyLinkedList(Object[] array) {
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

public class DoublyLinkedListExample {
    public static void main(String[] unused) {
        DoublyLinkedList listOne = new DoublyLinkedList(new Integer[] {1, 2, 3, 90});
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

    }
}