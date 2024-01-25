package version3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        Car[] cars=new Car[3];
        for (int i = 0; i < cars.length; i++) {
            Car car=new Car();
            cars[i]=car;
            System.out.println("第"+(i+1)+"辆车记录开始");
            System.out.println("品牌：");
            cars[i].setBrand(scanner.next());
            System.out.println("价格：");
            cars[i].setPrice(scanner.nextInt());
            System.out.println("颜色：");
            cars[i].setColor(scanner.next());
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
        for (int i = 0; i < cars.length; i++) {
            sum=sum+cars[i].getPrice();
        }
        System.out.println("平均价格是："+sum/ cars.length);
    }
}
