package Hi;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashmapImplementation<T> {

    public static void main(String[] args) {

        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("24", "64");
        hashmap.put("32", "80");
        hashmap.put("35", "100");

        Set<String> set = hashmap.keySet();
        Set<Map.Entry<String, String>> set1 = hashmap.entrySet();

        for (Map.Entry<String, String> e : set1) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        //Linked Hashset for fixed insertion order
        //Hashtable for thread safety
        for (String key : set) {
            System.out.println(hashmap.get(key));
        }


    }
}
