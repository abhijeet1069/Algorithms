package ctci.linkedList;

import ctci.linkedList.basics.LinkedList;
import ctci.linkedList.basics.Node;

public class ReturnKthToLast {

    public static LinkedList returnKthToLast(LinkedList list, int count){
        int ptr = 1;
        LinkedList res = null;
        Node head = list.getHead();
        while(head != null){
            if(ptr == count){
                
            }
            ptr++;
            head = head.getNext();
        }
    }

    public static void main(String[] args) {

    }
}
