package version5;

public class stringBuilder {
    public static void main(String[] args) {
        /*
        StringBuilder使用场景：
            1.字符串拼接
            2.字符串反转
        */

        String test="abc";
        StringBuilder stringBuilder1=new StringBuilder();
        StringBuilder stringBuilder2=new StringBuilder(test);

        stringBuilder1.append(test);
        stringBuilder2.append(test);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

        System.out.println("————————————reversal()—————————————");

        stringBuilder1.reverse();
        System.out.println(stringBuilder1);

        stringBuilder2.reverse();
        System.out.println(stringBuilder2);

        System.out.println("—————————————toString()—————————————");

        String one=stringBuilder1.toString();
        String two=stringBuilder2.toString();

        System.out.println(one);
        System.out.println(two);

        System.out.println("——————————————————————————————————");

        String address=new String();
        System.out.println(address);

        System.out.println("——————————————————————————————————");


        /*
        链式编程：
        当我们在调用一个方法时，不需要用变量接收方法的结果，可以继续调用其他方法；
        */

    }
}
