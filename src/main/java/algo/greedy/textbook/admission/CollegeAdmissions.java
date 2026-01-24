package algo.greedy.textbook.admission;

import java.util.*;

public class CollegeAdmissions {
    public HashMap<String, List<Student>> getAdmissionList(Map<String,Institute> institutes
            , List<Student> students){

        Queue<Student> freeStudents = new LinkedList<>(students);

        while (!freeStudents.isEmpty()) {
            Student s = freeStudents.poll();

            if (!s.hasNextPreference())
                continue;

            Institute institute = institutes.get(s.nextInstitute());

            Student rejected = institute.consider(s);

            if (rejected != null) {
                freeStudents.add(rejected);
            }
        }
        HashMap<String,List<Student>> finalAdmissionList = new HashMap<>();
        for (Institute inst : institutes.values())
            finalAdmissionList.put(inst.name, inst.getFinalList());

        return finalAdmissionList;
    }
}
