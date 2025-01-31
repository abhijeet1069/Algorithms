package algorithm.c1.s3.theory.knowGenerics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ? represents an unknown type.
 * It is often used when the exact type isn’t relevant or needs to remain flexible.
 * Wildcards are useful in read-only scenarios.
 * You can read elements, but adding new elements is generally not allowed because the exact type is unknown.
 * */

public class WildCards {

    // upper bound. Only Number and its subclasses can use this method
    public static double sum(List<? extends Number> numbers) {
        double total = 0.0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    // lower bound. Only Integer and its super classes can use this method
    public static void print(List<? super Integer> numbers) {
        for (Object obj : numbers) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Number> list  = Arrays.asList(12.4,2);
        print(list);
        //System.out.println(sum(list));
    }
}
