package JavaCollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String>  toys = new ArrayList<>();
        toys.add("Bus");
        toys.add("Horse");
        toys.add("Car");
        /* getting iterator for the toys */
        Iterator<String> itr  = toys.iterator();
        while (itr.hasNext()) {
            String toy = itr.next();
            System.out.println("Playing with the : " + toy );
        }
    }
}


