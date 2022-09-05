import java.util.ArrayList;

public class NumToText {

    public static void main(String[] args) {
        int number = 321546987;
        String textNumber = "";
        ArrayList<Integer> array = new ArrayList<>();

        do {
            array.add(number % 10);
            number /= 10;
        } while (number > 0);

        for (int i = array.size() - 1; i >= 0; i--)

            switch (array.get(i)) {
                case 1:
                    textNumber += "one ";
                    break;
                case 2:
                    textNumber += "two ";
                    break;
                case 3:
                    textNumber += "three ";
                    break;
                case 4:
                    textNumber += "four ";
                    break;
                case 5:
                    textNumber += "five ";
                    break;
                case 6:
                    textNumber += "six ";
                    break;
                case 7:
                    textNumber += "seven ";
                    break;
                case 8:
                    textNumber += "eight ";
                    break;
                case 9:
                    textNumber += "nine ";
                    break;
                default:
                    break;
            }
        System.out.print(textNumber);
    }
}

