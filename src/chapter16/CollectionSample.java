package chapter16;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
        Collection<Integer> collections = (Collection<Integer>) List.of(11,12,13,14);
        List<Integer> nums = new ArrayList<>(30);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(1, 100);
        nums.addAll(collections);

        System.out.println(nums);

        List<Integer> syncList = Collections.synchronizedList(nums);
        ArrayList<String> words = (ArrayList<String>) Arrays.asList("QUERY","ASDFG", "ZXCVB");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<String> names = List.of("Royal", "Goodness", "God's Joy", "Rejoice");
    }
}