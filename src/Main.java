import string.*;

/**
 * Created by user on 03.02.14.
 */
public class Main {
    public static void main(String ... args) {
        Text t = new Text("Hello! This is very long text. It is sorted. Does it look nice?");
        System.out.println(t);
        t.sortByLength();
        System.out.println(t);
    }
}
