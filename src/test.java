import java.util.Scanner;

public class test {public static void main(String[] args) {
    age();
}

    public static void age(){
        Scanner sc = new Scanner(System.in);

        int x = 0;
        while (true) {
            try {
                x = Integer.parseInt(sc.nextLine());
                System.out.println("Вы ввели: " +x );
                break;
            } catch (Exception e) {
                System.out.println("Вы ввели не число. Введите число");
            }

        }

    }
}
