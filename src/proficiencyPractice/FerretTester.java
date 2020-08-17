package proficiencyPractice;

class Ferret implements Comparable {
    private double length;

    public Ferret(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double d) {
        this.length = d;
    }

    public int compareTo(Object second) {
        Ferret newSecond = (Ferret) second;
        if (second == null || !(second instanceof Ferret)) {
            return -1;
        }
        if (this.getLength() > newSecond.getLength()) {
            return 1;
        } else if (this.getLength() < newSecond.getLength()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class FerretTester {
    public static void main(String[] args) {
        Ferret one = new Ferret(5);
        Ferret two = new Ferret(3);
        System.out.println(one.getLength());
        System.out.println(two.getLength());
        System.out.println(one.compareTo(two));
    }
}
