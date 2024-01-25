package version5;

import java.util.Scanner;

public class printString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String test=scanner.next();

        for (int i = 0; i < test.length(); i++) {
            char a=test.charAt(i);
            System.out.println(a);
        }
        System.out.println(test);
    }
}
