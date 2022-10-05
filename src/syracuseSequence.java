public class syracuseSequence {
    public void syracuseSequence(int number) {
        int counter = 0;
        String string = String.valueOf(number);

        while (number > 1) {
            counter++;
            number = number % 2 == 0 ? number / 2 : number * 3 + 1;
            string = string + " -> " + number;
        }

        System.out.println(counter);
        System.out.println(string);
    }
    public static void main(String[] args) {
syracuseSequence syracuseSequence = new syracuseSequence();
syracuseSequence.syracuseSequence(123456);
    }
}

