import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxWords;

    public PersonComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
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
    }
}