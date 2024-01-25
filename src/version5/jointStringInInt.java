package version5;

public class jointStringInInt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        StringBuilder list=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            list=list.append(arr[i]);
        }
        String List= list.toString();
        System.out.print("[");
        for (int i = 0; i < List.length(); i++) {
            System.out.print(List.charAt(i));
            if (i==List.length()-1){
                break;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }
}
