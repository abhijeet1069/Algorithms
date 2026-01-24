package algo.greedy.textbook.admission;

import java.util.List;

public class Student {
    String name;
    int marks;
    List<String> preferences;
    int nextPreferenceIndex = 0;

    public Student(String name, int marks, List<String> preferences) {
        this.name = name;
        this.marks = marks;
        this.preferences = preferences;
    }

    public boolean hasNextPreference() {
        return nextPreferenceIndex < preferences.size();
    }

    public String nextInstitute() {
        return preferences.get(nextPreferenceIndex++);
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}