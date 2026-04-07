package CRUD;

public class StudentTest {
    static void main() {
        Student s1 = new Student(1, "张三", 18);
        Student s2 = new Student(2, "李四", 19);
        Student s3 = new Student(3, "王五", 17);

        Student[] arr = new Student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Student s4 = new Student(4, "刘六", 21);
        if (contains(arr, s4.getId())) {
            IO.println("学号已存在，不能重复添加。");
        } else {
            if (arr.length == count(arr)) {
                // 数组已满，需要扩容
                Student[] newArr = newArray(arr);
                newArr[count(arr)] = s4;
                arr = newArr; // 更新原数组引用
            } else {
                // 直接把新的对象加到数组尾部
                arr[count(arr)] = s4;
            }
        }
        print(arr);

        int deleted_id = 3;
        if (contains(arr, deleted_id)) {
           for (int i = 0; i < count(arr); i++) {
               if (arr[i] != null && arr[i].getId() == deleted_id) {
                   arr[i] = null;
               }
           }
        } else {
            IO.println("学号不存在，无法删除。");
        }

        if (contains(arr, 2)) {
            for (int i = 0; i < count(arr); i++) {
                if (arr[i] != null && arr[i].getId() == 2) {
                    arr[i].setAge(arr[i].getAge() + 1);
                }
            }
        } // 修改年龄

        print(arr);
    }

    // 1. 我们要做什么事？
    // 2. 我们需要什么素材？素材是什么？是参数。
    // 3. 需要给别人什么结果。
    // 4. 数组中可能存在 null e.g., [s1, s2, null]
    static boolean contains(Student[] arr, int id) {
        for (Student student : arr) { // int i = 0; i < arr.length; i++ || 我还是觉得这个比较直观。
            if (student != null && student.getId() == id) {
                return true;
            }
        }
        return false;
    }

    static int count(Student[] arr) {
        int count = 0;
        for (Student student : arr) {
            if (student != null) { count++; }
        }
        return count;
    }

    static Student[] newArray(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    static void print(Student[] arr) {
        for (Student student : arr) {
            if(student != null) {
                System.out.println(student);
            }
        }
    }
}
