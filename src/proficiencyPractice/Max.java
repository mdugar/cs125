package proficiencyPractice;

public abstract class Max implements Comparable{
    public static Comparable max(Comparable first, Comparable second) {
        int result = first.compareTo(second);
        if(result > 0) {
            return first;
        } else if(result < 0) {
            return second;
        }
        return first;
    }
}
