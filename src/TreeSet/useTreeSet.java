package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class useTreeSet {
    static void main() {
        Set<Student> studentSet = new TreeSet<Student>();

        Student s1 = new Student("姓名1",
                19,
                149.5,
                130,
                122);
        Student s2 = new Student("姓名1",
                19,
                149.5,
                130,
                122);
        Student s3 = new Student("姓名2",
                20,
                100,
                130.5,
                122);
        Student s4 = new Student("Bob",
                18,
                100,
                0,
                0);
        Student s5 = new Student("Alice",
                20,
                100,
                0,
                0);

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);

        IO.println(studentSet);
    }
}
