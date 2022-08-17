import java.util.Arrays;
public class SortNumber {
    public static void main(String[] args) {
        int num = 252216;
        StringBuilder sb = new StringBuilder();
        int array[] = Integer.toString(num).chars().map(a -> a - '0').toArray();
        Arrays.sort(array);
        for (int i = array.length-1; i >=0; i--) {
            sb.append(array[i]);
        }
        num = Integer.parseInt(String.valueOf(sb));
        System.out.println(num);
    }
}
