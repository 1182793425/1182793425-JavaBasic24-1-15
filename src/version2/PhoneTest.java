package version2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1=new Phone();

        phone1.brand="xiaomi";
        phone1.price=3999;
        System.out.println(phone1.brand);
        System.out.println(phone1.price);

        phone1.call();
        phone1.playGame();
        phone1.call();
        phone1.playGame();
    }
}
