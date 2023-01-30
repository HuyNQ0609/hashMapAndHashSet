import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program {
        Student student1 = new Student("Tom", 20, "Los Angeles");
        Student student2 = new Student("Jerry", 15, "New York");
        Student student3 = new Student("Mickey", 18, "London");
    public void runMap() {
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...................Set");
    }
    public void runSet() {
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
