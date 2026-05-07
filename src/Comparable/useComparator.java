package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class useComparator {
    static void main() {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Jack");
        names.add("Jackson");

//        Collections.sort(names);
        names.sort(new customComparator());

        IO.println(names);
    }
}

class customComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() != o2.length()) {
            return o1.length() - o2.length();
        } else {
            return o1.compareTo(o2);
        }
    }
}
