public class WordsBuffer {


    public static void main(String[] args) {


        StringBuffer sb  = new StringBuffer("абвгдеёжз");

        sb.replace(3,3, "Java");
        System.out.println(sb);


    }


}
