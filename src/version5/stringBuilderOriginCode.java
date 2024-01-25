package version5;

public class stringBuilderOriginCode {
    public static void main(String[] args) {
        StringBuilder test=new StringBuilder();

        System.out.println(test.capacity());
        System.out.println(test.length());

        test.append("abcdefghijklmnopqrstuvwxyz");

        System.out.println(test.capacity());
        System.out.println(test.length());

        test.append("1234567890");

        System.out.println(test.capacity());
        System.out.println(test.length());
    }
}
