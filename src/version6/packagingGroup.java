package version6;

import java.util.ArrayList;

public class packagingGroup {
    /*
        包装类
        byte -> Byte
        short -> Short

        char -> Character   ———————***
        int -> Integer      ———————***

        long -> Long
        float -> Float
        double -> Double
        boolean -> Boolean
        * */
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.print('[');

        for (int i = 0; i < integers.size(); i++) {
            if (i!=0){
                System.out.print(" ");
            }
            System.out.print(integers.get(i));
            if (i== integers.size()-1){
                break;
            }else {
                System.out.print(',');
            }
        }

        System.out.print(']');
    }
}
