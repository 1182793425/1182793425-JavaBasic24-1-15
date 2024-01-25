package version5;

import java.util.Scanner;

public class phoneNumberHidden {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String num=scanner.next();

//        ——————————————————————————————————————替换
        char[] phone_number=new char[11];
        for (int i = 0; i < 11; i++) {
            phone_number[i]=num.charAt(i);
            if (i>2&&i<7){
                phone_number[i]='*';
            }
        }
        System.out.println();
        for (int i = 0; i < phone_number.length; i++) {
            System.out.print(phone_number[i]);
        }
//        ——————————————————————————————————————subString();
        System.out.println();

        System.out.print(
                num.substring(0,3)+"****"+num.substring(7)
        );
    }
}
