/**
 * @author huangFuJin
 * @date 2019/10/20 18:26
 * mail: naaturalmaster@gmail.com
 */
public class IntegerReverse {

    public static void main(String[] args) {
        int test1 = 247483639;
        int res = mod10(test1);
        System.out.println("res is " + res);
    }

    // 利用字符串的方法
    public static int reverse(int x) {
        String xStr = x + "";
        if (x < 0 ){
            xStr = xStr.substring(1);
        }
        char[] xArray = xStr.toCharArray();

        int i = 0;
        int j = xStr.length() - 1;

        while(i < j && i < xStr.length() && j >= 0){
            char tmp;
            tmp = xArray[i];
            xArray[i] = xArray[j];
            xArray[j] = tmp;
            i++;
            j--;
        }

        Long res = Long.valueOf(new String(xArray));
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
            return 0;
        }
        if ( x < 0 )
            return -res.intValue();
        return res.intValue();
    }

    // 直接使用模10想加的方法

    public static int mod10(int x) {
        int result = 0;
        int pop;
        while( x != 0) {
            pop = x%10;
            x/=10;

            if (result > Integer.MAX_VALUE/10 || ( result == Integer.MAX_VALUE/10 && pop > 7 )) return 0;
            if (result < Integer.MIN_VALUE/10 || ( result == Integer.MIN_VALUE/10 && pop < -8)) return 0;
            result = result * 10 + pop;
        }
        return result;
    }
}
