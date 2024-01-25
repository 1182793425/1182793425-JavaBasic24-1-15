package version5;

import java.util.Scanner;

public class symmetryString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1=scanner.next();
        String s2=new StringBuilder(s1).reverse().toString();
        if (s1.equals(s2)){
            System.out.println("对称");
        }else {
            System.out.println("不对称");
        }
    }
}
