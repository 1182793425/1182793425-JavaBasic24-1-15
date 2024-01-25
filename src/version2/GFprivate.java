package version2;

public class GFprivate {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age<=0||age>=50){
            System.out.println("非法数据");
        }else {
            this.age = age;
        }
    }


    public GFprivate(){
        System.out.println("空参构造方法运行了");
    }
    public GFprivate(int age){
        this.age=age;
    }
}
