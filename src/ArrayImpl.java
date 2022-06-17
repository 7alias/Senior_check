import java.util.Scanner;

public class ArrayImpl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nums[][] = new int[3][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Enter 123456789:");
                nums[i][j] = scanner.nextInt();
            }
        }
        for (int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums[x].length; y++) {
                System.out.print(nums[x][y]);

            }
            System.out.println();
        }

    }
}
