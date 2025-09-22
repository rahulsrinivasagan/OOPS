import java.util.*;
public class CollectionFrameworkDemo {
    public static void main(String[] args) {        
        // ----- ArrayList (List interface - Ordered, allows duplicates) -----
        System.out.println("---- ArrayList Demo ----");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");  // Duplicate allowed
        System.out.println("ArrayList: " + list);
        // ----- HashSet (Set interface - Unordered, no duplicates) -----
        System.out.println("\n---- HashSet Demo ----");
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red");  // Duplicate ignored
        System.out.println("HashSet: " + set);

        // ----- HashMap (Map interface - Key-Value pairs) -----
        System.out.println("\n---- HashMap Demo ----");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "John");
        map.put(102, "Alice");
        map.put(103, "Bob");
        map.put(102, "Emma"); // Overwrites value for key 102
        System.out.println("HashMap: " + map);

        // Iterate over HashMap
        System.out.println("\nIterating over HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
