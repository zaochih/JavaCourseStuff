package useHashMap;

import java.util.HashMap;
import java.util.Set;

public class useHashMap {
    static void main() {
        HashMap<String, Double> priceMap = new HashMap<String, Double>();

        priceMap.put("Apple", 9.98);
        priceMap.put("Banana", 8.89);
        priceMap.put("Pineapple", 8.88);

        IO.println(priceMap);

        Set<HashMap.Entry<String, Double>> entries = priceMap.entrySet();
    }
}
