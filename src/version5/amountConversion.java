package version5;

import java.util.Scanner;

public class amountConversion {
    public static void main(String[] args) {
        char[] Chinese={'壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        char[] index={'1','2','3','4','5','6','7','8','9'};
        Scanner scanner=new Scanner(System.in);

        String amount=scanner.next();
        char[] reversal=new char[amount.length()];

        for (int i = 0; i < reversal.length; i++) {
            reversal[i]=amount.charAt(amount.length()-1-i);
        }

        for (int i = 0; i < reversal.length; i++) {
            System.out.print(reversal[i]);
        }

        System.out.println();

        for (int i = 0; i < reversal.length; i++) {
            for (int j = 0; j < index.length; j++) {
                if (reversal[i]==index[j]){
                    reversal[i]=Chinese[j];
                }
            }
        }
        for (int i = 0; i < reversal.length; i++) {
            System.out.print(reversal[i]);
        }
        System.out.println();

        char[] end=new char[7];
        for (int i = 0; i < end.length; i++) {
            end[i]='零';
        }

        for (int i = 0; i < reversal.length; i++) {
            end[i]=reversal[i];
        }

        for (int i = 0; i < end.length; i++) {
            System.out.print(end[i]);
        }
        System.out.println();
        System.out.println("————————————————————————————————————");
        System.out.println(
                end[6]+"佰"+
                end[5]+"拾"+
                end[4]+"万"+
                end[3]+"仟"+
                end[2]+"佰"+
                end[1]+"拾"+
                end[0]+"元"
        );

    }
}
