package chapter16;

import java.util.LinkedList;
import java.util.List;

public class Collection2 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Ayo");
        names.add("Toyin");
        System.out.println(names);
        boolean b = names.contains("Ayo");
        System.out.println(b);

        List<String> list = java.util.List.of("Royal", "Ayo", "Toyin", "Rejoice");
        boolean b1 = names.containsAll(list);
        System.out.println(b1);
    }
}
