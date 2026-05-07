package Comparable;

import java.util.ArrayList;

public class Test {
    static void main() {
        ArrayList<Student> list = new ArrayList<Student>();

        Student stu1 = new Student("zhangsan", 11, 100);
        Student stu2 = new Student("lisi", 11, 120);
        Student stu3 = new Student("wangwu", 12, 100);
        Student stu4 = new Student("liuliu", 13, 110);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        list.sort(null);

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
