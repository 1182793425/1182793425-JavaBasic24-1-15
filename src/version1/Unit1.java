package version1;

import java.util.Scanner;

public class Unit1 {
    public static void main(String[] args) {
        System.out.print("原价（数字形式）：");
        Scanner p = new Scanner(System.in);
        double ticket = p.nextDouble();
        System.out.print("月份（数字形式）：");
        Scanner m = new Scanner(System.in);
        int month = m.nextInt();
        System.out.print("1头等舱or2经济舱（数字形式）：");
        Scanner l = new Scanner(System.in);
        int level = l.nextInt();
        countPrice(ticket, month, level);
    }
    public static void countPrice(double originalPrice, int month, int cabinLevel) {
        double endPrice = 0;
        int discountIndex;

        if (month < 1 || month > 12) {
            System.out.println("无效的月份");
            return;
        }

        if (cabinLevel != 1 && cabinLevel != 2) {
            System.out.println("无效的舱位等级");
            return;
        }

        if (month >= 5 && month <= 10) {
            discountIndex = 1;
        } else {
            discountIndex = 0;
        }

        if (cabinLevel == 1) {
            endPrice = getEndPrice(discountIndex, endPrice, originalPrice, 0.9, 0.7);
        } else {
            endPrice = getEndPrice(discountIndex, endPrice, originalPrice, 8.5, 6.5);
        }

        System.out.println(endPrice);
    }

    private static double getEndPrice(int discountIndex, double endPrice, double originalPrice, double x, double x1) {
        switch (discountIndex) {
            case 1:
                endPrice = originalPrice * x;
                break;
            case 0:
                endPrice = originalPrice * x1;
                break;
        }
        return endPrice;
    }


}
