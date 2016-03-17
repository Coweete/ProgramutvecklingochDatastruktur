package laboration4;

import java.util.Comparator;

/**
 * Created by jonatan on 2016-03-17.
 */
public class FirstNameAsc implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}
