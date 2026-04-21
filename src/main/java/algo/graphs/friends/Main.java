package algo.graphs.friends;

public class Main {
    public static void main(String[] args) {
        FriendshipGraph graph = new FriendshipGraph();

        Student ram = new Student(1,"Ram");
        Student shyam = new Student(2,"Shyam");
        Student amit = new Student(3,"Amit");

        graph.addStudent(ram);
        graph.addStudent(shyam);
        graph.addStudent(amit);

        graph.addFriendship(ram,shyam);
        graph.addFriendship(ram,amit);

        graph.printGraph();
    }
}
