package algo.heap.theory;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class HeapDefaultCollection {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.marks - o1.marks;
            }
        });
        pq.add(new Student("Alice",90));
        pq.add(new Student("Satyam",70));
        pq.add(new Student("Fineas",80));
        pq.add(new Student("Ferb",40));

        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
