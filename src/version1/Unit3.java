package version1;

import java.util.Random;

public class Unit3 {
    public static void main(String[] args) {
        Random random = new Random();
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
        if (random.nextBoolean()) {
            arr[i] = (char) (random.nextInt(25) + 65);
            } else {
            arr[i] = (char) (random.nextInt(25) + 97);
        }
    }
        char index = (char) (random.nextInt(10) + '0');
        arr[random.nextInt(arr.length)] = index;

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "");
            }
    }
}

