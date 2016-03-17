package laboration2;

import java.util.Comparator;

/**
 * Created by jonatan on 2016-03-17.
 */
public class FamilyName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getFamilyName().compareTo(p2.getFamilyName());
    }
}
