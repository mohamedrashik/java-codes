package code.datastructures.linear.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayIteration {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        Iterable<Integer> iterable = Arrays.asList(array);
        Iterator<Integer> iterator = iterable.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

       for (Integer integer : iterable) {
           System.out.println(integer);
       }
    }
}
