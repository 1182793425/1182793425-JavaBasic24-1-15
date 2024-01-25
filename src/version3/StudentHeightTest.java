package version3;

import static version3.Student.isIdDuplicate;

public class StudentHeightTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "test1", 10);
        students[1] = new Student(2, "test2", 13);

        int activeLength = 2; // 当前学生数组的有效长度

        int newId = 3;
        String newName = "test3";
        int newAge = 20;

        if (!isIdDuplicate(newId, students) && activeLength < students.length) {
            students[activeLength] = new Student(newId, newName, newAge);
            activeLength++;
        } else {
            System.out.println("无法添加新学生。");
        }

        for (int i = 0; i < activeLength; i++) {
            System.out.println("学生ID: " + students[i].getId());
            System.out.println("姓名: " + students[i].getName());
            System.out.println("年龄: " + students[i].getAge());
            System.out.println();
        }
    }
}