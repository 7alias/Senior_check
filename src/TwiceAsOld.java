public class TwiceAsOld {

    public static void main(String[] args) {
        int a = 300;
        int b = 100;
        twiceAsOld(a, b);
    }

    public static void twiceAsOld(int dadYears, int sonYears) {
        int year = 0;

        while (true) {
            if (dadYears == sonYears * 2) {
                break;
            } else if (dadYears > sonYears * 2) {
                year++;
                sonYears++;
                dadYears++;
            } else {
                year--;
                sonYears--;
                dadYears--;
            }
        }
        System.out.println(Math.abs(year));
    }
}

