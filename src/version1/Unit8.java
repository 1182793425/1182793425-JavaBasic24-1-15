package version1;

import java.util.Random;

public class Unit8 {
    public static void main(String[] args) {
/*
        Scanner scanner=new Scanner(System.in);
        System.out.print("red:");
        int red=scanner.nextInt();
        System.out.print("blue:");
        int blue=scanner.nextInt();
*/
        int[] end=doubleColorBall(6);
        int red=end[0];
        int blue=end[1];
        int prize=countPrize(red,blue);
        System.out.println(prize);
    }

    public static int[] doubleColorBall(int countRed){
        int[] red=new int[countRed];
        Random random=new Random();
        int allRed=0;
        int[] back=new int[2];
        for (int i = 0; i <red.length; i++) {
            red[i]=random.nextInt(50);
            if (red[i]>=1&&red[i]<=33){
                allRed++;
            }
            back[0]=allRed;
            back[1]=random.nextInt(2);
        }return back;
    }
    public static int countPrize(int red,int blue) {
        int sum=0;
        if (red<=2){
            sum=5;
            return sum;
        }
        if (red<4||(red==4||blue==0)){
            sum=10;
            return sum;
        }
        if (red<5||(red==5||blue==0)){
            sum=200;
            return sum;
        }
        if (red==5&&blue==1){
            sum=3000;
            return sum;
        }
        if (red==6&&blue==0){
            sum=5000000;
            return sum;
        }
        if (red==6&&blue==1){
            sum=10000000;
            return sum;
        }
        return sum;
    }

}
