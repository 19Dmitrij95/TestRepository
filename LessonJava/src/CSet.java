import java.util.*;

public class CSet {

    public static void main(String[] args) {

       LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
       linkedHashMap.put(0, "Red");
       linkedHashMap.put(1, "Green");
       linkedHashMap.put(2, "Blue");

       for(Map.Entry<Integer, String>entry:linkedHashMap.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue());

       }
    }
}
