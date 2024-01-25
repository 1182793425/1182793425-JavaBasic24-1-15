package version5;

import java.util.Scanner;

public class stringReplace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String origin=scanner.next();
        String[] hidden={
                "TMD",
                "艹"
        };
        for (int i = 0; i < hidden.length; i++) {
            origin=origin.replace(hidden[i],"*");
        }
        System.out.println(origin);
    }
}
