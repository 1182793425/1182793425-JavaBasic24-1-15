package version1;

public class Unit2 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 100; i < 201; i++) {
            boolean flag=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    flag=false;
                    break;
                }
            }if (flag){
                System.out.println(i+"是质数");
                count++;
            }
        }
        System.out.println("共有"+count+"个质数");
    }
}
