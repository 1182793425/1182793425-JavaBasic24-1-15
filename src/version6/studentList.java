package version6;

import version3.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class studentList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Student student1=new Student(1,"spb",18);
        Student student2=new Student(2,"wx",18);
        Student student3=new Student(3,"frm",18);
        Student studentTest=new Student();
        studentTest.setId(scanner.nextInt());
        studentTest.setName(scanner.next());
        studentTest.setAge(scanner.nextInt());

        ArrayList<Student> students=new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(studentTest);

//        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
