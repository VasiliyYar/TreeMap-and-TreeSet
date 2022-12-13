import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main (String[] args){
        List<Person> people = new ArrayList<>();
        int max=3;
        PersonComparator personComparator = new PersonComparator(max);


        people.add(new Person("Vasiliy", "Efipov-Solov'ev-Severniy", 40));
        people.add(new Person("Nikolay", "Petrov-Zadunaiskiy", 45));
        people.add(new Person("Yan", "Ivanov", 30));
        people.add(new Person("Val", "Nosov-Perviy", 15));
        people.add(new Person("Ilona", "Solov'eva", 17));
        System.out.println();
        System.out.println(people);
        System.out.println();
        Collections.sort(people, new PersonComparator(max));
        System.out.println(people);
        System.out.println();
        people.removeIf(s -> s.getAge() < 18);
        people.forEach(s -> System.out.print(s + " "));
        System.out.println();


    }
}
