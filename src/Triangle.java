import java.util.ArrayList;
import java.util.List;

public class Triangle {


    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            allNumbers.add(i);
            for (int j = i + 1; j < 9; j++) {
                allNumbers.add(j);
                for (int k = j + 1; k < 10; k++) {
                    allNumbers.add(k);

                    for (int l = 1; l < 10; l++) {
                        if (allNumbers.contains(l)) continue;
                        allNumbers.add(l);

                        for (int m = 1; m < 10; m++) {
                            if (allNumbers.contains(m)) continue;
                            allNumbers.add(m);

                            for (int n = 1; n < 10; n++) {
                                if (allNumbers.contains(n)) continue;
                                allNumbers.add(n);

                                for (int o = 1; o < 10; o++) {
                                    if (allNumbers.contains(o)) continue;
                                    allNumbers.add(o);

                                    for (int p = 1; p < 10; p++) {
                                        if (allNumbers.contains(p)) continue;
                                        allNumbers.add(p);

                                        for (int q = 1; q < 10; q++) {
                                            if (allNumbers.contains(q)) continue;
                                            allNumbers.add(q);

                                            if ((allNumbers.get(0) + allNumbers.get(1) + allNumbers.get(3) + allNumbers.get(4) == 17) &&
                                                    (allNumbers.get(1) + allNumbers.get(2) + allNumbers.get(5) + allNumbers.get(6) == 17) &&
                                                    (allNumbers.get(2) + allNumbers.get(0) + allNumbers.get(7) + allNumbers.get(8) == 17)) {
                                                System.out.println("Первая сторона " + allNumbers.get(0) + " " + allNumbers.get(1) + " " + allNumbers.get(3) + " " + allNumbers.get(4));
                                                System.out.println("Вторая сторона " + allNumbers.get(1) + " " + allNumbers.get(2) + " " + allNumbers.get(5) + " " + allNumbers.get(6));
                                                System.out.println("Третья сторона " + allNumbers.get(2) + " " + allNumbers.get(0) + " " + allNumbers.get(7) + " " + allNumbers.get(8));
                                                return;
                                            }
                                            while (allNumbers.contains(q))
                                                allNumbers.remove(Integer.valueOf(q));
                                        }
                                        while (allNumbers.contains(p))
                                            allNumbers.remove(Integer.valueOf(p));
                                    }
                                    while (allNumbers.contains(o))
                                        allNumbers.remove(Integer.valueOf(o));
                                }
                                while (allNumbers.contains(n))
                                    allNumbers.remove(Integer.valueOf(n));
                            }
                            while (allNumbers.contains(m))
                                allNumbers.remove(Integer.valueOf(m));
                        }
                        while (allNumbers.contains(l))
                            allNumbers.remove(Integer.valueOf(l));
                    }
                    while (allNumbers.contains(k))
                        allNumbers.remove(Integer.valueOf(k));
                }
                while (allNumbers.contains(j))
                    allNumbers.remove(Integer.valueOf(j));
            }
            while (allNumbers.contains(i))
                allNumbers.remove(Integer.valueOf(i));
        }
    }
}

