import java.util.HashMap;
import java.util.Map;

public class LearningHashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer>  dataMap = new HashMap<>();
        // insertion in HashMap is done through .put function
        dataMap.put("ching", 150);
        dataMap.put("india", 130);
        dataMap.put("united states of america ", 30);
        System.out.println(dataMap);
// hashmaps are the unordered set of maps
        //keys can't be same
        //search and lookup option
        if(dataMap.containsKey("china")){
            System.out.println(" present as the key in the map");

        }else {
            System.out.println("key is not present in the map");
        }
        //finding the value of the key
        System.out.println(dataMap.get("india"));
        // if key present , then it provides the value otherwise null


        //Iterator in HashMap
        //new for loop for the collection
        int arr [] = {12,34,455,};
        for(int value:arr){
            System.out.println("value of the arrray is :" + value);
        }
        System.out.println();

        //Iteration
        //syntax:
       /* for (dataMap.Entry<String,Integer> e : dataMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }*/

        // Iterating using enhanced for loop
        // Iterating using enhanced for loop
        // Iterating using enhanced for loop
        // Iterating using enhanced for loop
        // Iterating using enhanced for loop


        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }


        // Iterating using keySet()
        // Iterating using keySet()
        // Iterating using keySet()
        // Iterating using keySet()
        for (String key : dataMap.keySet()) {
            Integer value = dataMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        dataMap.remove("china");
        System.out.println(dataMap);



    }
}
