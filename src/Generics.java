import java.util.ArrayList;
import java.util.List;

public class Generics extends ClassCastException {
    public static void main(String[] args) throws ClassCastException {
        List<Object> list = new ArrayList<Object>();
        list.add("Stol");
        list.add(new Worker("Ivan", "Ivanov", 30));
try{
        for (Object s : list) {
            System.out.println(s + " length " + ((String) s).length());
        }}
catch (ClassCastException e){

    System.out.println(e.toString().substring(30, 57));
}

    }
}

class Worker {
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Worker(String ivan, String ivanov, int age) {
        this.firstName = ivan;
        this.lastName = ivanov;
        this.age = age;
    }
}
