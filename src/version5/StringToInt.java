package version5;

public class StringToInt {
    public static int power(int i){
        if (i==0){
            return 1;
        }
        int back=1;
        for (int j = 0; j < i; j++) {
            back=back*10;
        }
        return back;
    }
    public static int convert(String string){
        int a=0;
        StringBuilder stringBuilder=new StringBuilder(string);
        string=stringBuilder.reverse().toString();
        char[] arr=string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            a=a+(arr[i]-48)*power(i);
        }
        return a;
    }
    public static void main(String[] args) {
        String A="123456";
        String B="1234";
        int end=convert(A)*convert(B);
        System.out.println(end);
        //        System.out.println(10^2);

    }
}
