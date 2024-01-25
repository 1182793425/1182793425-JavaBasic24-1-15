package version5;

import java.util.Scanner;

public class upper_lower_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int upper = 0;
        int lower = 0;
        int number = 0;
        char[] arr = new char[a.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.charAt(i);
            if (Character.isUpperCase(arr[i])) {
                upper++;
            }
            if (Character.isLowerCase(arr[i])){
                lower++;
            }
            if (Character.isDigit(arr[i])){
                number++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("大写："+upper);
        System.out.println("小写："+lower);
        System.out.println("数字："+number);
    }
}
