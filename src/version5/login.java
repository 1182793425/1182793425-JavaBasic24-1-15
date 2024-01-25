package version5;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String user="1182793425";
        String passwd="123456";

        for (int i = 0; i<=3; i++) {
            System.out.print("用户名：");
            String user_tool=scanner.next();
            System.out.print("密码：");
            String passwd_tool=scanner.next();

            if (user.equals(user_tool)&&passwd.equals(passwd_tool)){
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("输入有误，请重新输入,剩余次数"+(2-i)+"次");
                if ((2-i)==0){
                    System.out.println("登录次数过多,禁止登陆");
                    break;
                }
            }
        }


    }
}
