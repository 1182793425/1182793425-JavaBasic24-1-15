package version1;

import java.util.Random;

public class Unit7 {
    public static void main(String[] args) {
        int[] arr = {2, 58, 888, 1000, 10000};
        boolean[] index = {true, true, true, true, true};
        outPrize(arr, index);
    }

    public static void outPrize(int[] arr, boolean[] index) {
        Random random = new Random();
        for (int i = 0; i < 5; ) {
            int j = random.nextInt(arr.length);
            if (index[j]) {
                System.out.println("恭喜抽到" + arr[j]);
                index[j] = false;
                i++;
            }
        }
    }
}

