import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<Person> people = new ArrayList<>();
        int max=3;
        PersonComparator personComparator = new PersonComparator(max);
        people.add(new Person("Vasiliy", "Efipov-Solov'ev-Severniy", 40));
        people.add(new Person("Nikolay", "Petrov-Zadunaiskiy", 45));
        people.add(new Person("Yan", "Ivanov", 30));
        people.add(new Person("Val", "Nosov-Perviy", 15));
        System.out.println(people);
        Collections.sort(people, new PersonComparator(max));
        System.out.println(people);


    }
}
