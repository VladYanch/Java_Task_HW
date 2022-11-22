import java.util.Comparator;

public class SortBySalary implements Comparator<Emploee> {
    @Override
    public int compare(Emploee o1, Emploee o2) {
        return o1.getSalary()- o2.getSalary();
    }
}
