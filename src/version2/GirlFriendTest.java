package version2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girlFriend1=new GirlFriend();
        girlFriend1.name="test";
        girlFriend1.age=18;

        System.out.println(girlFriend1.name);
        System.out.println(girlFriend1.age);

        girlFriend1.Cry();
    }
}
