import java.util.Arrays;

public class CompareDiag {
    public static void main(String[] args) {

        int a [][] = new int[10][10];

        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a.length; y++) {
                a[x][y] = (int)Math.random();
            }
        }

        for (int i = 0; i < a[0].length; i++) {


            System.out.println(Arrays.toString(a[i]));
        }

    }
}
