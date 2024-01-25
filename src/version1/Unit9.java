package version1;

public class Unit9 {
    public static void main(String[] args) {
        int[][] arr={{11,22},{33,44},{55,66}};
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int k = 0; k < arr[i].length; k++) {
                sum=sum+arr[i][k];
            }
            System.out.println("第"+(i+1)+"个季度总和是："+sum);
        }
    }
}

