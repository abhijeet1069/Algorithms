package algorithm.c1.s3.theory.knowGenerics;

/**
 * Generic in JAVA allow you to write code that can operate on objects of various types while providing compile-time
 * type safety. Generics are implemented using type erasure, meaning that type information is removed at compile time
 * and replaced with Object or the upper bound of the generic type. So, primitives are not supported in generics.
 *
 * Convention:
 * T : Type
 * E : Element (used in collections)
 * K : Key (used in maps)
 * V : Value (used in maps)
 * N : Number
 *
 * Java does not support generic exceptions due to type erasure
* */
public class GenericClasses {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("rabbit");
        //box.setItem(2); //Compile-Time Error
        System.out.println(box.getItem());
    }
}
// Generic Class
class Box<T>{
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}
