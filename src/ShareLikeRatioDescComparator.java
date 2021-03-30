import java.util.Comparator;

public class ShareLikeRatioDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {

        double o1sharesperlikes = (double) o1.getShares() / (double) o1.getLikes();
        double o2sharesperlikes = (double) o2.getShares() / (double) o2.getLikes();

        return Double.compare(o2sharesperlikes, o1sharesperlikes);
    }
}
