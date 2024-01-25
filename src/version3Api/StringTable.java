package version3Api;

public class StringTable {
    public static void main(String[] args) {
        /*
    StringTable 串池：存储 字符串（直接赋值型）
    JDK7之前：在方法区
    JDk7开始：在堆内存
    */

//    —————————————————————————————————————————— 直接赋值型

        String s1 = "abc";//s1=0x0010
     /*
     1.寻找StringTable中是否有abc
     2.创建abc 并将abc的物理地址传给s1；
     */

        String s2 = "abc";//s2=s1=0x0010
        /*串池有abc*/

//    节省空间

//    —————————————————————————————————————————— 手动new出来的
        char[] chas = {'a', 'b', 'c', 'd'};//chas=0x0011
        String news1 = new String(chas);//news1=0x0022
        String news2 = new String(chas);//news2=0x0033

//    互相独立

//    —————————————————————————————————————————— 总结
//    所以字符不能修改支撑以上两种特性

//    ——————————————————————————————————————————

        boolean index=(news1==news2);
        System.out.println(index);

    }
}
