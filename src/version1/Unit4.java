package version1;

public class Unit4 {
    public static void main(String[] args) {
        int[] arr1={12,58,65,18,86,88,798};
        int[] arr2={15,58,66,78,33,78,65,45};
        System.out.println(copyArray(arr1,1,arr2));
    }
    public static boolean copyArray(int[] arr,int index,int[] arr2) {
        if (index>=arr.length||index>=arr2.length) return false;
        if (arr[index]==arr2[index]){
            System.out.println("相同");
            return true;
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[index]=arr[index];
        }
        return true;
    }
}
