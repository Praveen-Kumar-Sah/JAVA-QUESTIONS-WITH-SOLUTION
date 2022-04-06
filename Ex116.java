// Hash Maps in java
import java.util.Map.Entry;
import java.util.*;
public class Ex116 {
    public static void main(String[] args) {
        Map<String , Integer> mp = new HashMap<>();

        // store data
        mp.put("one", 1);
        mp.put("two",2);
        mp.put("three", 3);
        mp.put("one", 5);

        // put if absent
        mp.putIfAbsent("two", 10);

        System.out.println(mp);

        // get function
        System.out.println(mp.get("three"));

        // conrtains funcrion
        System.out.println(mp.containsValue(3));

        // replace function
        mp.replace("three", 3, 11);
        System.out.println(mp);

        // remove function
        mp.remove("three");
        System.out.println(mp);

        // keyset, values and entryset
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        Set<Entry<String, Integer>> ent = mp.entrySet(); 
        for(Entry<String , Integer> en : ent){
            en.setValue(en.getValue() * 100);
        }
        System.out.println(mp);
    }

    
}
