package version5;

import java.util.Scanner;

public class reversalString {
    private static char[] reversal(char[] arr){
        char[] arr2=new char[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr[arr.length-i-1];
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        char[] char_list=new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            char_list[i]=a.charAt(i);
        }
        String b=new String(reversal(char_list));

        System.out.println(b);

    }
}
