

public class Persistence {
    public static void main(String[] args) {

        System.out.println(persistence(99999));


    }
    public static int persistence(long n) {
        if (n < 10)
            return 0;
        int i = 1;
        long product = 1;
        while (n != 0) {
            int p = (int) n % 10;
            product = product * p;
            System.out.println(n);
            n = n / 10;
            if (n == 0 && product / 10 != 0) {
                n = product;
                product = 1;
                i++;

            }
        }
        return i;
    }
}



