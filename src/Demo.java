import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Posting> posts = new ArrayList<>();
        System.out.println("Unsortiert" + "\n--------- \n");


        posts.add(new Posting(12, "Niki", "nik879", LocalDateTime.now(), 120, 15, 260));
        posts.add(new Posting(36, "Max", "maxi_doe", LocalDateTime.of(2021,5,18,10,15), 280, 654, 4821));
        posts.add(new Posting(18, "Susi", "susl", LocalDateTime.of(2018,4,13,12,15), 196, 465, 260));
        posts.add(new Posting(29, "Berta", "berta_cd", LocalDateTime.of(2016,1,12,10,15), 56, 64, 468));
        posts.add(new Posting(43, "Marie", "msmr", LocalDateTime.of(2021,12,12,8,45), 843, 465, 5468));
        posts.add(new Posting(45, "Doris", "dorli", LocalDateTime.of(2001,11,16,23,15), 5648, 564, 8468));
        posts.add(new Posting(111, "Conny", "con76", LocalDateTime.of(1996,6,23,7,45), 5648, 154, 24860));
        posts.add(new Posting(37, "Erich", "erich23", LocalDateTime.of(2012,4,13,12,10), 546, 76, 2468));
        posts.add(new Posting(15, "Vannessa", "Vani_ds", LocalDateTime.of(2017,1,28,16,30), 79, 546, 1658));
        posts.add(new Posting(96, "Lukas", "Luki_ge", LocalDateTime.of(2007, 8, 18, 18, 30), 876, 846, 456));

        System.out.println(posts);

        Collections.sort(posts);

        System.out.println("-----------\n\n");

        System.out.println("Sortiert nach ID" + "\n--------- \n");
        System.out.println(posts);
        System.out.println("-----------\n\n");

        System.out.println("Sortiert nach Realname" + "\n--------- \n");
        Collections.sort(posts, new RealnameAscComparator());
        System.out.println(posts);
        System.out.println("-----------\n\n");

        System.out.println("Sortiert nach DateTime" + "\n--------- \n");
        Collections.sort(posts, new DateTimeDescComparator());
        System.out.println(posts);

        System.out.println("-----------\n\n");
        System.out.println("Sortiert nach Views und Shares" + "\n--------- \n");
        Collections.sort(posts, new ViewDescSharesAscComparator());
        System.out.println(posts);

        System.out.println("-----------\n\n");
        System.out.println("Sortiert nach Likes per View" + "\n--------- \n");
        Collections.sort(posts, new LikesPerViewAscComparator());
        System.out.println(posts);

        System.out.println("-----------\n\n");
        System.out.println("Sortiert nach shares per likes" + "\n--------- \n");
        Collections.sort(posts, new ShareLikeRatioDescComparator());
        System.out.println(posts);

    }
}
