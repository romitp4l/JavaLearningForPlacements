package JavaCollectionFramework;



        import java.util.*;

public class ArrayListCompleteImplimentation  {
    public static void main(String[] args) {
        // creating a new arraylist

        ArrayList<String> fruits = new ArrayList<>( ) ;
        // adding elements
        fruits.add("Mango");
        fruits.add("apple");
        fruits.add("Grapes");
        fruits.add("Orange");

        //Accessing arraylist elements

        // 1. using get method

        System.out.println("-----------------------using get method ----------");
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(2));


        // 2. using for loop


        System.out.println("-----------------using for loop -------------------");

        for (int i = 0; i < fruits.size(); i++) {

            String fruit = fruits.get(i);
            System.out.println(fruit);

        }


        // 3. using for-each loop
        System.out.println("-----------using for-each loop ---------------");


        for (String fruit : fruits )
        {
            System.out.println(":>>><<<<   ");
            System.out.println(fruit);

        }

        // 4. using iterators
        System.out.println("---------------- using  iterators ---------------");
        Iterator<String> iter =  fruits.iterator();
        while (iter.hasNext())
        {
            String fruit = iter.next();
            System.out.println(fruit);
        }



        //updating the elements in the arraylist

        System.out.println("================  updating the elements in the arraylist =======================");
        fruits.set(3,"Kiwi");

        System.out.println("updated element at index 3 " +fruits.get(3));
        System.out.println("updated array " +
                fruits);


        //removing elements from the arraylist
        System.out.println("========  removing elements from arraylist ============");
        fruits.remove(0);
        System.out.println("updated array " +
                fruits);


    }
}

