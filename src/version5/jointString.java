package version5;

public class jointString {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        extracted(arr);
    }

    private static void extracted(int[] list) {
        int[] basic=list;
        int arr_length = basic.length * 2 + 1;
        char[] arr=new char[arr_length];
        arr[0]='[';
        arr[arr_length-1]=']';

        for (int i = 0; i <basic.length; i++) {
            arr[1+2*i]=(char)(basic[i]+48);
            if ((2+2*i)!=arr_length-1) {
                arr[2 + 2 * i] = ',';
            }
        }

        String a=new String(arr);

        System.out.println(a);
    }
}
