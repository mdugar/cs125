package ClassExercises.lists;

public interface SimpleList {
    /** Get the object at this index. */
    Object get(int index);
    /** Set the object at this index to the passed element. */
    void set(int index, Object element);
    /** Add the object at the specified location in the list. */
    void add(int index, Object element);
    /** Remove and return the object at the specified location in the list. */
    Object remove(int index);
    /** Return the number of elements in the list. */
    int size();
}
