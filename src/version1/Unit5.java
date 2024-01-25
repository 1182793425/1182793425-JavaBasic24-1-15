package version1;

import java.util.Scanner;

public class Unit5 {
    public static void main(String[] args) {
        int[]grade=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < grade.length; i++) {
            System.out.print("第"+(i+1)+"位评分(0-100):");
            grade[i]= sc.nextInt();
        }
        double aver=countAverageGrade(grade);
        System.out.println(aver);

    }

    private static double countAverageGrade(int[]arr) {
        int sum=0;
        for (int j : arr) {
            sum = sum + j;
        }
        return (double) (sum - searchMax(arr) - searchMin(arr)) / (arr.length-2);
    }
    
    private static int searchMax(int[] arr) {
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    
    private static int searchMin(int[] arr) {
        int min=arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

}

