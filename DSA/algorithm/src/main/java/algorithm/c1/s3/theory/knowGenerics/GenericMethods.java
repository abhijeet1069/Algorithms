package algorithm.c1.s3.theory.knowGenerics;

public class GenericMethods {

    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        //int[] arr = new int[]{1,1,2,3,5,8,13,21};
        //printArray(arr); //compile time error - generics dont work with primitives
        String[] arr = new String[]{"fe","fi","fo","fum"};
        printArray(arr);
    }
}
