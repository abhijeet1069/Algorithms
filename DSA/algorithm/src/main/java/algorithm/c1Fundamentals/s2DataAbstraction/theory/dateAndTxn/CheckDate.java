package algorithm.c1Fundamentals.s2DataAbstraction.theory.dateAndTxn;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.Transaction;

public class CheckDate {
//          Output:
//            753351
//            752979
//            753351
    public static void testDate(){
        Date date1 = new Date("01/20/2025");
        Date date2 = new Date("01/20/2024");
        Date date3 = date1;
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
        System.out.println(date3.hashCode());
    }

    public static void testTxn(){
        Transaction txn = new Transaction("SATYAM 12/12/2024 209");
        System.out.println(txn.when());
    }

    public static void main(String[] args) {
        testTxn();
    }
}
