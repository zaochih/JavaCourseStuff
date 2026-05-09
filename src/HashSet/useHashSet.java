package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class useHashSet {
    static void main() {
        List<Student> StudentList = new ArrayList<Student>();

        Student s1 = new Student("student 1", 18);
        Student s2 = new Student("student 2", 19);
        Student s3 = new Student("student 3", 20);
        Student s4 = new Student("student 4", 21);
        Student s5 = new Student("student 5", 22);
        Student s6 = new Student("student 6", 23);
        Student s7 = new Student("student 6", 23);
        Student s8 = new Student("student 6", 23);
        Student s9 = new Student("student 9", 22);
        Student s10 = new Student("student 9", 22);

        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);
        StudentList.add(s4);
        StudentList.add(s5);
        StudentList.add(s6);
        StudentList.add(s7);
        StudentList.add(s8);
        StudentList.add(s9);
        StudentList.add(s10);

        Set<Student> StudentSet = new HashSet<Student>(StudentList);

        for (Student student : StudentSet) {
            System.out.println(student);
        }
    }
}
