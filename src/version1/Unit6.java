package version1;

public class Unit6 {
    public static void main(String[] args) {
        int[] arr={1,9,8,3};
        int[] psw=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        for (int i = 0; i < psw.length; i++) {
            psw[i]=arr[arr.length-1-i];
        }
        for (int i = 0; i < psw.length; i++) {
            System.out.print(psw[i]+",");
        }
    }
}
