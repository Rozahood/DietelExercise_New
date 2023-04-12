package Private;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.random.RandomGenerator;

import static java.lang.Integer.sum;

public class ArrayCw {
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(9);
        nums.add(5);
        nums.add(7);
        nums.add(0);
        List<Integer> num = new ArrayList<Integer>(nums);
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < nums.size(); i++) {
            num.remove(i);
            int total = sum(num);
            result.add(total);
            num.clear();
            num.addAll(nums);
        }
        System.out.println(result);
        int min = result.get(0);
        int max = result.get(0);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) < min) min = result.get(i);
            if (result.get(i) > max) max = result.get(i);
        }

        List<Integer> minMax = new ArrayList<Integer>();
        List<Integer> minMaxIndex = new ArrayList<Integer>();
        minMax.add(min);
        minMax.add(max);
        minMaxIndex.add(result.indexOf(min));
        minMaxIndex.add(result.indexOf(max));
        System.out.println(minMax);
        System.out.println(minMaxIndex);






    }

    private static int sum(List<Integer> num) {
        int total = 0;
        for (int number :
             num) {
            total = total + number;
        }
        return total;
    }
}