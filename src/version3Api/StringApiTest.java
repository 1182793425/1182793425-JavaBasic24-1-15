package version3Api;

import java.util.Scanner;

public class StringApiTest {
    public static void main(String[] args) {
//        ————————————————————————————————
        String name="name_test";
        String schoolName="school_test";
//        ————————————————————————————————
        name="name_test2";
        schoolName="school_test2";
        //并没有改变，只是创建了新的两个字符串
        System.out.println(name+schoolName);
//        ————————————————————————————————
        /*以上语句一共创建了5个字符串：
        1.name_test
        2.school_test
        3.name_test2
        4.school_test2
        5.name_test2school_test2    */
//        ————————————————————————————————

        String s1="abcde";

        String s2=new String();
        System.out.println(s2+"finish");

        String s3=new String(s1);
        System.out.println(s1);

        char[] arr={'a','b','c','d','e'};
        String s4=new String(arr);
        System.out.println(s4);

        //字节数组类型的而数组——————————ASCII码
        byte[] arr2={97,98,99,100,101};
        String s5=new String(arr2);
        System.out.println(s5);

        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s4));


        Scanner scanner=new Scanner(System.in);

        System.out.println("————————————————————————————————");
        System.out.print("直接赋值：（地址值：串池中）");
        System.out.println(s1);
        System.out.print("newString（地址值：堆内存中）");
        System.out.println(s4);
        System.out.println("输入与直接赋值比较");
        String sc1=scanner.next();
        System.out.println(sc1==s1);
        System.out.println("输入与new的String比较");
        String sc2=scanner.next();
        System.out.println(sc2==s4);

    }
}
