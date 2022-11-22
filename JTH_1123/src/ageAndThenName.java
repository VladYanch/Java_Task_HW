import java.util.Comparator;

public class ageAndThenName implements Comparator<Emploee> {

    @Override
    public int compare(Emploee o1, Emploee o2) {
        if (o1.getAge() == o2.getAge()) {
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getAge()- o2.getAge();
    }
}
