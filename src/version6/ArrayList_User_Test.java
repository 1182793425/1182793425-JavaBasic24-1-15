package version6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_User_Test {
    public static int search(ArrayList<ArrayList_User> users,int id){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId()==id){
                return i;
            }
        }
        System.out.println("未查到");
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList_User> users=new ArrayList<>();
        ArrayList_User u1=new ArrayList_User(1,"spb1","123");
        ArrayList_User u2=new ArrayList_User(2,"spb2","123");
        ArrayList_User u3=new ArrayList_User(3,"spb3","123");

        users.add(u1);
        users.add(u2);
        users.add(u3);

        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();

        int i=search(users,index);
        if (i!=-1) {
            System.out.println(users.get(i));
        }

    }
}
