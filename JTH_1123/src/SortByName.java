import java.util.Comparator;

public class SortByName implements Comparator<Emploee> {
    @Override
    public int compare(Emploee o1, Emploee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
