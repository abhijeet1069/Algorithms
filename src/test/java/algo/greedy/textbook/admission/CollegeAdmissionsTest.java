package algo.greedy.textbook.admission;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static algo.greedy.textbook.admission.InstituteName.*;
import static org.junit.jupiter.api.Assertions.*;

class CollegeAdmissionsTest {

    @Test
    void testAdmissionList(){
        List<Student> students = List.of(
                new Student("Satyam",10,List.of(IIT,ISM,NIT)),
                new Student("Abhishek",20,List.of(IIT,ISM,NIT)),
                new Student("Karan",30,List.of(IIT,ISM,NIT))
        );

        Map<String, Institute> institutes = new HashMap<>();
        institutes.put(IIT,new Institute(IIT,1));
        institutes.put(ISM,new Institute(ISM,1));
        institutes.put(NIT,new Institute(NIT,1));

        CollegeAdmissions admissions = new CollegeAdmissions();
        System.out.println(admissions.getAdmissionList(institutes,students));

    }

}