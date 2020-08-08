package ClassExercises.exceptions;

class StringStorage {
    /**
     * Create a new object to store strings.
     *
     * @param storageSize the size of the StringStorage,
     *        must be positive
     */
    public StringStorage(final int storageSize) throws Exception {
        if (storageSize <= 0) {
            throw new Exception("Can't create StringStorage with negative size: " + storageSize);
        }
    }
}
public class CheckedExceptions {
    public static void main(final String[] unused) {
        try {
            StringStorage stringStorage = new StringStorage(-1);
        } catch (Exception e) {
            System.out.println("Please read the manual");
        }
    }
}
