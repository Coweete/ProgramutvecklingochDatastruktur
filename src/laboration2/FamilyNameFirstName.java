package laboration2;

import java.util.Comparator;

/**
 * Created by jonatan on 2016-03-17.
 */
public class FamilyNameFirstName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int res = p1.getFamilyName().compareTo(p2.getFamilyName());
        if(res == 0){
            res = p1.getFirstName().compareTo(p2.getFirstName());
        }
        return res;
    }
}
