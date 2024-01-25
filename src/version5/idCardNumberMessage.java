package version5;

import java.util.Scanner;

public class idCardNumberMessage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String idNum=scanner.next();
//        System.out.println(idNum.length());
        if (idNum.length()!=18){
            System.out.println("格式错误");
            return;
        }

        //123456200111090030;

        char genderend='0';
        char gender=idNum.charAt(16);
//        System.out.println(gender);

        int index=(int)(gender-48);
//        System.out.println(index);

        if (index%2==0){
            genderend='女';
        }else {
            genderend='男';

        }
        System.out.println(
                "人物信息"+idNum.substring(0,6)+"\n"+
                "出生年份："+idNum.substring(6,10)+"\n"+
                "出生月份："+idNum.substring(10,12)+"\n"+
                "出生日子："+idNum.substring(12,14)+"\n"+
                "性别："+genderend

        );
    }
}
