package version7ProjectStudent.main;

import version7ProjectStudent.com.Admin;
import version7ProjectStudent.com.STU;

import java.util.ArrayList;
import java.util.Scanner;

public class studentSystemMain {
    public static void fixPasswdByID(ArrayList<Admin> admins,int id){
        Scanner scanner=new Scanner(System.in);
        System.out.print("新密码是");
        int newPasswd=scanner.nextInt();
        admins.get(findPasswdById(admins,id)).setPassword(newPasswd);
        System.out.println("修改成功");
    }
    public static int findPasswdById(ArrayList<Admin> admins,int id){
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getUser()==id){
                return i;
            }
        }
        return -1;
    }
    public static void addAdmin(ArrayList<Admin> admins){
        Admin adAdmin=new Admin();
        Scanner scanner=new Scanner(System.in);
        System.out.print("adminID:");
        int id=scanner.nextInt();
        if (findPasswdById(admins,id)!=-1){
            System.out.println("id重复");
            return;
        }
        adAdmin.setUser(id);
        System.out.print("adminPasswd:");
        adAdmin.setPassword(scanner.nextInt());
        admins.add(adAdmin);
        System.out.println("添加成功，请重新登录");
    }
    public static boolean login(ArrayList<Admin> admins){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请登录：");
        System.out.print("adminId:");
        int user=scanner.nextInt();
        for (int i = 0; i < admins.size(); i++) {
            if (user==admins.get(i).getUser()){
                System.out.print("adminPasswd:");
                int passwd=scanner.nextInt();
                if (passwd==admins.get(i).getPassword()){
                    System.out.println("登陆成功");
                    return true;
                }else {
                    System.out.println("密码错误");
                    System.out.println(
                            "1.找回密码"+"\n"+ "2.重新登录"+"\n"
                            );
                            switch (scanner.nextInt()){
                                case 1:
                                    //找回密码
                                    System.out.print("请输入要找回账户的adminId：");
                                    int id=scanner.nextInt();
                                    if (findPasswdById(admins,id)==-1){
                                        System.out.println("未找到当前adminId");
                                    }else {
                                        System.out.println(admins.get(findPasswdById(admins,id)));
                                    }
                                    break;
                                case 2:
                                    //重新登陆
                                    break;
                            }
                    return false;

                }
            }
        }
        System.out.println("adminId不存在");
        return false;
    }
    public static int searchById(ArrayList<STU> students,int id){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    public static void inquireById(ArrayList<STU> students,int id){
        int i = searchById(students, id);
        if (i !=-1){
            System.out.println(students.get(i));
            return;
        }else {
            System.out.println("查无此人");
        }
    }
    public static void add(ArrayList<STU> students,int id){
        if (searchById(students,id)!=-1){
            System.out.println("id重复");
            return ;
        }
        Scanner scanner=new Scanner(System.in);
        STU stu=new STU();
        stu.setId(id);
        System.out.println("name:");
        stu.setName(scanner.next());
        System.out.println("age:");
        stu.setAge(scanner.nextInt());
        System.out.println("address:");
        stu.setAddress(scanner.next());
        students.add(stu);
    }
    public static void deleteById(ArrayList<STU> students,int id){
        int i = searchById(students, id);
        if (i ==-1){
            System.out.println("查无此人");
            return;
        }
        students.remove(i);

    }
    public static void editStudent(ArrayList<STU> students,int id){
        int i=searchById(students,id);
        if (i!=-1){
            System.out.println("查询成功");
            System.out.println(students.get(i));
        }else {
            System.out.println("查无此人");
            return;
        }
        Scanner scanner=new Scanner(System.in);
//        deleteById(students,id);
        System.out.println("请输入修改的id：");
        int newId=scanner.nextInt();
        students.get(i).setId(newId);
        System.out.println("name:");
        students.get(i).setName(scanner.next());
        System.out.println("age:");
        students.get(i).setAge(scanner.nextInt());
        System.out.println("address:");
        students.get(i).setAddress(scanner.next());
    }
    public static void serviceGo(ArrayList<STU> students,ArrayList<Admin> admins) {
        boolean admit=login(admins);
        if (!admit) {
            System.out.println("登陆失败");
            serviceGo(students, admins);
        }
        adminGo(students, admins);


    }
    public static void adminGo(ArrayList<STU> students, ArrayList<Admin> admins) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(
                "欢迎来到学生管理系统"+"\n"+
                        "1.添加学生"+"\n"+
                        "2.删除学生"+"\n"+
                        "3.修改学生"+"\n"+
                        "4.查询学生"+"\n"+
                        "5.遍历学生"+"\n"+
                        "6.添加管理员"+"\n"+
                        "7.遍历管理员"+"\n"+
                        "8.修改管理员密码"+"\n"+
                        "9.重新登录"+"\n"+
                        "10.退出"+"\n"+
                        "请输入的你的选择(填写标号数字即可)："
        );
        int index=(scanner.nextInt());

        switch (index) {
            case 1:
                System.out.println("输入要添加对象的ID：");
                int id1=scanner.nextInt();
                add(students,id1);
                break;
            case 2:
                System.out.println("输入要删除对象的ID：");
                int id2=scanner.nextInt();
                deleteById(students, id2);
                break;
            case 3:
                System.out.println("输入要修改对象的ID：");
                int id3=scanner.nextInt();
                editStudent(students,id3);
                break;
            case 4:
                System.out.println("输入要查询对象的ID：");
                int id4=scanner.nextInt();
                inquireById(students,id4);
                break;
            case 5:
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));
                }
                break;
            case 6:
                //添加管理员
                addAdmin(admins);
                break;
            case 7:
                //遍历管理员
                for (int i = 0; i < admins.size(); i++) {
                    System.out.println(admins.get(i));
                }
                break;
            case 8:
                //修改管理员密码
                System.out.print("请输入要修改的管理员id：");
                int fixById=scanner.nextInt();
                fixPasswdByID(admins,fixById);
                break;
            case 9:
                serviceGo(students,admins);
                break;
            case 10:
                return;
        }
        System.out.println("————————————————————————————————");
        adminGo(students, admins);
    }
}

