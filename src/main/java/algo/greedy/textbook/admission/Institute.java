package algo.greedy.textbook.admission;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Institute {
    public String name;
    int capacity;
    PriorityQueue<Student> admitted;

    public Institute(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;

        // lowest marks at top
        admitted = new PriorityQueue<>(Comparator.comparingInt(s -> s.marks));
    }

    public Student consider(Student s) {
        if (admitted.size() < capacity) {
            admitted.add(s);
            return null;
        }

        Student worst = admitted.peek();
        if (worst!=null && s.marks > worst.marks) {
            admitted.poll();
            admitted.add(s);
            return worst;
        }

        return s;
    }

    public List<Student> getFinalList() {
        List<Student> list = new ArrayList<>(admitted);
        list.sort((a, b) -> b.marks - a.marks);
        return list;
    }
}
