import java.util.Comparator;

public class ViewDescSharesAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        int cmpViews = Integer.compare(o2.getViews(), o1.getViews());

        if (cmpViews == 0) {
            return Integer.compare(o1.getShares(), o2.getShares());
        }
        return cmpViews;
    }
}
