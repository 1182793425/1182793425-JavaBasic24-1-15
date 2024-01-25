package version3;

public class GFTest {

    public static double averAge(GF[] gfs){
        double aver=0;
        for (int i = 0; i <gfs.length ; i++) {
            aver+=gfs[i].getAge();
        }
        return aver/ gfs.length;
    }

    public static void printTeenageGF(GF[] gfs){
        for (int i = 0; i < gfs.length; i++) {
            if (gfs[i].getAge()<=averAge(gfs)){
                System.out.println(gfs[i].toString());
            }
        }

    }

    public static void main(String[] args) {
        GF[] gfs=new GF[4];
        GF gf1=new GF("test1",18,"女","hobby1");
        GF gf2=new GF("test2",16,"女","hobby2");
        GF gf3=new GF("test3",19,"女","hobby3");
        GF gf4=new GF("test4",20,"女","hobby4");

        gfs[0]=gf1;
        gfs[1]=gf2;
        gfs[2]=gf3;
        gfs[3]=gf4;
        System.out.println(averAge(gfs));
        printTeenageGF(gfs);
    }
}
