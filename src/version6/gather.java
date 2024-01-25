package version6;

import java.util.ArrayList;

public class gather {
    /*
    数组：长度固定 基本数据类型             引用数据类型

    集合：长度自变 包装类(基本数据类型)      引用数据类型

    包装类：？？？？
————————————————————————————————————————————————————————————————————————————————————————
 */
    public static void main(String[] args) {
//        ArrayList
        ArrayList list=new ArrayList();
/*        泛型：用来限定数据类型
        ArrayList<String> listString=new ArrayList<String>(); ————JDk7之前的写法*/
        ArrayList<String> listString=new ArrayList<>();

        System.out.println(listString);//[]
//        打印的时候不是地址值，而是内容，并且有[]包着,并且有,隔着
        System.out.println(listString.size());

//        增
        listString.add("spb");
        listString.add("wx");
        listString.add("spb");
        listString.add("wx");
        System.out.println(listString);//[spb, wx,spb, wx]

//        删
        listString.remove(0);//[wx, spb, wx]
        System.out.println(listString.get(1));
        listString.remove("wx");//[spb, wx]
        //remove(Object)方法———>删除匹配到的第一个
        System.out.println(listString);
        System.out.println(listString.remove("frm"));//失败返回false

//        改
        System.out.println(listString.set(1,"frm"));//返回修改的元素
        System.out.println(listString);//[spb, frm]

//        查
        System.out.println(listString.get(1));

//        遍历
        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }
    }
}
