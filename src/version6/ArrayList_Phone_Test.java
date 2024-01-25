package version6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Phone_Test {
    public static int[] less(ArrayList<ArrayList_Phone> phones,int price){
        int[] arr=new int[phones.size()];
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice()<=price){
                arr[i]=1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList_Phone> phones=new ArrayList<>();

        ArrayList_Phone p1=new ArrayList_Phone("xiaomi",1000);
        ArrayList_Phone p2=new ArrayList_Phone("pingguo",8000);
        ArrayList_Phone p3=new ArrayList_Phone("chuizi",2999);
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);

        Scanner scanner=new Scanner(System.in);

        int price=scanner.nextInt();
        int arr[]=less(phones,price);

        for (int i = 0; i < phones.size(); i++) {
            if (arr[i]==1){
                System.out.println(phones.get(i));
            }
        }

    }
}
