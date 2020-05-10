package easy;

/**
 * @author huangFujin
 * @date 2020/5/10 15:04
 */
public class Sharp58 {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }

    public static void main(String[] args) {
        String test01 = "abcdefg";
        int pos = 2;
        String result01 = new Sharp58().reverseLeftWords(test01, 2);
        System.out.println("res: " + result01);
    }

}
