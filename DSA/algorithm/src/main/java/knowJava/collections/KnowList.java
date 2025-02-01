package knowJava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Key features of List interface:
 * a) Order preservation
 * b) Index based access
 * c) Allows Duplicates
 *
 * An arraylist is a resizable array implementation of the List interface. Unlike arrays in Java, which have a fixed
 * size, an ArrayList can change its size dynamically as elements are added or removed. This flexibility makes it
 * popular choice when the number of elements in a list isn't known in advance.
 *
 * */

public class KnowList {
    public static void main(String[] args) {
        String msg = "fe fi fo fum I smell the blood of a little boy";
        List<String> arr = Arrays.asList(msg.split(" "));
        System.out.println(arr);
        arr.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(arr);
    }
}
