package version5;

import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        String a="123";
        StringJoiner stringJoiner=new StringJoiner(",","{","}");
        for (int i = 0; i < 3; i++) {
            stringJoiner=stringJoiner.add(a);
        }
        System.out.println(stringJoiner.length());
        System.out.println(stringJoiner.toString());
    }
}
