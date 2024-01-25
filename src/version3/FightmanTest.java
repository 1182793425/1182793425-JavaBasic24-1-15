package version3;

public class FightmanTest {
    public static void main(String[] args) {
        Fightman f1=new Fightman("n1",100,20,0.33);
        Fightman f2=new Fightman("n2",100,22,0.3);

        System.out.println(f1.toString());

        for (int i = 0; i < 30; i++) {
            f1.attack(f2);
            f2.attack(f1);
            if (f1.getBlood()==0||f2.getBlood()==0){
                System.out.println("f1:"+f1.getBlood()+",f2:"+f2.getBlood());
                break;
            }

        }

    }
}
