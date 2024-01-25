package version3;

import java.util.Scanner;

public class ScannerTestAll {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       /*
        //第一套体系————遇见空格，制表符，回车 停止接收!! 多余的输入会被下一个输入函数获取
        scanner.nextInt();//整数
        scanner.nextDouble();//小数
        scanner.next();//字符串

        //第二套体系
        scanner.nextLine();//接受字符串————遇见空格是空格字符
        */

        //两套体系不能混用——Test
        int Int=scanner.nextInt();
        System.out.println(Int);
        String str=scanner.next();
        System.out.println(str);
        //直接将缓冲区的回车填进下一个Line内存中并停止接收
        String Line=scanner.nextLine();
        System.out.println(Line);



    }
}
