package version5;

public class adjustString {
    public static boolean mapping(String A,String B){
        String C=A;
        for (int i = 0; i <A.length(); i++) {
            C = C.substring(1, A.length()) + C.charAt(0);
            if (C.equals(B)) {
                System.out.println("匹配成功");
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String A="abcdef";
        String B="cdefab";
        System.out.println(mapping(A,B));
    }
}
