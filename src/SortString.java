import java.util.Arrays;

public class SortString {



        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            int a = 25020;
            String x = "" + a;
            int f = x.length();
            char[] c = new char[x.length()];
            System.out.println(x);
            for (int i = 0; i < x.length(); i++) {
                c[i] = x.charAt(i);
            }
            Arrays.sort(c);
            System.out.println(Arrays.toString(c));
            x="";
            for (int j = f-1; j >= 0; j--) {
                sb.append(c[j]);
            }
            System.out.println(sb);
            a = Integer.parseInt(String.valueOf(sb));
            System.out.println(a);

        }
    }


