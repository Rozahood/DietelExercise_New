package chapter16;

import java.util.HashSet;
import java.util.Set;

public class Collection3 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Tinuade(AKA Birthday heh)");
        names.add("Felix(AKA Fada figure)");
        names.add("James(AKA Debbie)");
        names.add("Josh(AKA Family man)");

        System.out.println(names);

        System.out.println(names.toArray()[names.toArray().length - 2]);
    }
}
