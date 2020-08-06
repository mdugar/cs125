package proficiencyPractice;

import java.util.Arrays;

class LastTen {
    private int[] arr;
    private int freeIndex;

    public LastTen() {
        this.arr = new int[10];
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = 0;
        }
        this.freeIndex = 0;
    }

    public void add(int newValue) {
        if(freeIndex < 10) {
            arr[freeIndex] = newValue;
            freeIndex++;
        } else {
            arr[0] = newValue;
            freeIndex = 1;
        }
    }

    public int[] getLastTen() {
        return arr;
    }
}

public class testLastTen {
    public static void main(String[] args) {
        LastTen lt = new LastTen();
        lt.add(1);
        lt.add(3);
        lt.add(4);
        lt.add(5);
        System.out.println(Arrays.toString(lt.getLastTen()));
        lt.add(1);
        lt.add(7);
        lt.add(4);
        lt.add(557);
        lt.add(8);
        lt.add(3);
        lt.add(4);
        lt.add(5);
        System.out.println(Arrays.toString(lt.getLastTen()));
    }
}
