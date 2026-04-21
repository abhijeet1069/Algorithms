package algo.graphs.friends;

import java.util.*;

public class FriendshipGraph {
    private Map<Student, Set<Student>> adj = new HashMap<>();

    public void addStudent(Student s){
        adj.putIfAbsent(s,new HashSet<>());
    }

    public void addFriendship(Student s1, Student s2){
        adj.putIfAbsent(s1,new HashSet<>());
        adj.putIfAbsent(s2,new HashSet<>());

        adj.get(s1).add(s2);
        adj.get(s2).add(s1);
    }

    public Set<Student> getFriends(Student s){
        return adj.getOrDefault(s, Collections.emptySet());
    }

    public void printGraph(){
        for(Student s : adj.keySet()){
            System.out.print(s+" → ");
            for(Student friend : adj.get(s)){
                System.out.print(friend+" ");
            }
            System.out.println();
        }
    }
}
