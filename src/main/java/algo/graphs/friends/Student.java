package algo.graphs.friends;

import java.util.Objects;

//vertex of friendship graph
public record Student(int id, String name) {

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;

        if(o == null || getClass()!=o.getClass())
            return false;

        Student s = (Student)o;
        return id == s.id;
    }

    public int hashCode(){
        return Objects.hash(id);
    }
}
