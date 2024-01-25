package version5;

import java.util.Scanner;

public class amountConversion2 {
    public static void main(String[] args) {
        char[] Chinese = {'壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        char[] index = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();

        char[] reversal = new char[7];
        for (int i = 0; i < reversal.length; i++) {
            reversal[i] = '零';
        }

        for (int i = 0; i < num.length(); i++) {
            reversal[i] = num.charAt(num.length() - 1 - i);
        }

        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < Chinese.length; j++) {
                if (reversal[i] == index[j]) {
                    reversal[i] = Chinese[j];
                    break;
                }
            }
        }

        System.out.println(
                reversal[6] + "佰" +
                        reversal[5] + "拾" +
                        reversal[4] + "万" +
                        reversal[3] + "仟" +
                        reversal[2] + "佰" +
                        reversal[1] + "拾" +
                        reversal[0] + "元"
        );


    }
}
