
package version2;

public class GFprivateTest {
    public static void main(String[] args) {
        GFprivate gf1=new GFprivate();
        gf1.setAge(0);
        int i=gf1.getAge();
        System.out.println(i);

        GFprivate gf2=new GFprivate(20);
        System.out.println(gf2.getAge());
    }
}