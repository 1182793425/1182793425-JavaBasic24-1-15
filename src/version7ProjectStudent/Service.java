package version7ProjectStudent;

import version7ProjectStudent.com.Admin;
import version7ProjectStudent.com.STU;
import version7ProjectStudent.main.studentSystemMain;

import java.util.ArrayList;

public class Service {
    public static void main(String[] args) {
        ArrayList<STU> students=new ArrayList<>();
        ArrayList<Admin> admins=new ArrayList<>();

        Admin spbadmin=new Admin(123,123);
        admins.add(spbadmin);

        studentSystemMain.serviceGo(students,admins);

//        ——————————————2024/1/25  10days
    }
}
