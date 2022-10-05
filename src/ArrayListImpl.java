import java.util.ArrayList;

public class ArrayListImpl {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>(100);
        for (int i = 1; i <= 100; i++) {
            array.add(Math.abs((int) (100* Math.random())));
        }
int f = 0;
        for (int i = 0; i < array.size(); i++) {
            f += array.get(i);
        }
        System.out.println("Sum of numbers: " + f);
        int x = 0;
        for(Integer number: array){
            System.out.print("  " + number);
        }
        array.remove(Math.abs((int) (100* Math.random())));
        for (int j = 0; j < array.size(); j++) {
            x += array.get(j);
        }
        System.out.println("\n Sum of numbers including removed: " + x);
        System.out.println(" Removed number: " + (f - x));
        array.trimToSize();
        System.out.println("The list elements are:");
        for(Integer number: array){
            System.out.print("  " + number);
        }

    }

}
