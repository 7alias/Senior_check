import java.util.*;

public class ComparatorImpl {
    public static void main(String[] args) {

//-- usage
        List<Person> pList = new ArrayList<Person>();
        Person p = new Person();
        p.setName("A");
        p.setAge(10);
        pList.add(p);
        p = new Person();
        p.setName("Z");
        p.setAge(20);
        pList.add(p);
        p = new Person();
        p.setName("D");
        p.setAge(30);
        pList.add(p);


        //-- natural sorting i.e comes with object implementation, by age
        Collections.sort(pList);

        System.out.println(pList);
//        Вот как вы можете использовать анонимный встроенный компаратор для сортировки списка,
//        который не реализует Comparable, или в этом случае,
//        для сортировки списка в порядке, отличном от естественного упорядочения:

        //-- explicit sorting, define sort on another property here goes with name
        Collections.sort(pList, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(pList);


        Map<String, Integer> numberOfEmployees = new HashMap<>();
        numberOfEmployees.put("executives", 10);
        numberOfEmployees.put("human resources", 32);
        numberOfEmployees.put("accounting", 12);
        numberOfEmployees.put("IT", 100);

// Output the smallest departement in terms of number of employees
        numberOfEmployees.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(1)
                .forEach(System.out::println);   // outputs : executives=10
    }
}