package labs;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        lcm(85, 67);
    }

    public static void lcm(int i, int j) {
        int n = Math.max(i, j);
        int m = Math.min(i, j);
        boolean found = false;
        for(int k = 1; found == false; k++) {
            for(int h = 1; h <= k; h++) {
                if(m * k == n * h) {
                    found = true;
                    System.out.println("The Least Common Multiple of " + i + " and " + j + " is " + (m * k) + ".");
                }
            }
        }
    }
}
