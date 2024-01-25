package version5;

import java.util.Scanner;
import java.util.StringJoiner;

public class romanNumber {
    public static void main(String[] args) {
        String[] romanNum={" ","I","II","III","IV","V","VI","VII","VIII","IX"};
        Scanner scanner=new Scanner(System.in);
        String model=scanner.next();//123456
        if (model.length()>9){
            System.out.println("位数要求少于等于9位");
            return;
        }
        for (int i = 0; i < model.length(); i++) {
            if (model.charAt(i)<'0'||model.charAt(i)>'9'){
                System.out.println("只能是数字");
                return;
            }
        }
        StringJoiner end=new StringJoiner(",","[","]");
        for (int i = 0; i < model.length(); i++) {
            int index=model.charAt(i)-48;
            end.add(romanNum[index]);
        }
        System.out.println(end);
    }
}
