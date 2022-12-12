import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main (String[] args){
        List<Person> people = new ArrayList<>();

        int maxWords=3;
        //PersonComparator personComparator = new PersonComparator(max);
        Comparator<Person> personComparator = (o1, o2) -> {
            int words1 = o1.getSurname().split("-").length;
            int words2 = o2.getSurname().split("-").length;
            if (words1 != words2) {
                if (words1 < maxWords || words2 < maxWords) {
                    return Integer.compare(words1, words2);
                } else if (words1 >= maxWords && words2 >= maxWords) {
                    return Integer.compare(o1.getAge(), o2.getAge());
                } else {
                    if (words1 < maxWords || words2 < maxWords) {
                        return Integer.compare(words1, words2);
                    } else if (words1 >= maxWords && words2 >= maxWords) {
                        return Integer.compare(o1.getAge(), o2.getAge());
                    }
                }
            }
            return Integer.compare(o1.getAge(), o2.getAge());

        };


        people.add(new Person("Vasiliy", "Efipov-Solov'ev-Severniy", 40));
        people.add(new Person("Nikolay", "Petrov-Zadunaiskiy", 45));
        people.add(new Person("Yan", "Ivanov", 30));
        people.add(new Person("Val", "Nosov-Perviy", 15));
        people.add(new Person("Ilona", "Solov'eva", 17));
        System.out.println(people);
        Collections.sort(people, personComparator);
        System.out.println(people);


    }
}
