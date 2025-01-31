package algorithm.c1.s3.theory.knowGenerics;

import java.util.ArrayList;

public class WithoutGenerics {

    /**
     * Below code has 3 major issues:
     * a) No Type safety
     * b) Manual casting
     * c) No compile time checking
     * */
    public static void withoutGenerics(){
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);

        String str = (String) list.get(0);
        String str1 = (String) list.get(1);
    }

    public static void withGenerics(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        String s = list.get(0);
        String s1 = list.get(1);
    }

    public static void main(String[] args) {
        withGenerics();
        withoutGenerics(); //class cast exception
    }
}
