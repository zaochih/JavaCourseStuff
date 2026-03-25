package Student;

import java.util.Scanner;

public class StudentTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String inputLine = sc.nextLine();
            // 如果输入为空，则退出
            if (inputLine.trim().isEmpty()) {
                break;
            }
            Student.count++;
            IO.println("Student " + Student.getCount() + ":");
            String[] data = inputLine.split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            if (age >= 18) {
                Student.Inner inner = new Student.Inner();
                inner.call();
            }
            String gender = data[2];
            Student student = new Student();
            student.setName(name);
            student.setAge(age);
            student.setGender(gender);
            IO.println("Name: " + student.getName() + '\n' + "Age: " + student.getAge() + '\n' + "Gender: " + student.getGender());
        }
    }
}
