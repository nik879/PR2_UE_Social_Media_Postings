import java.util.Comparator;

public class DateTimeDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return o1.getDateTime().compareTo(o2.getDateTime());

    }
}
