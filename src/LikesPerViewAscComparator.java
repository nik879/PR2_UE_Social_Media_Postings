import java.util.Comparator;

public class LikesPerViewAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        double o1likesperviews = (double) o1.getLikes() / (double) o1.getViews();
        double o2likesperviews = (double) o2.getLikes() / (double) o2.getViews();

        return Double.compare(o1likesperviews, o2likesperviews);
    }
}
