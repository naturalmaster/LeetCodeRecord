package easy;

/**
 * @author huangFujin
 * @date 2020/5/10 15:10
 */
public class Sharp551 {
    public boolean checkRecord(String s) {
        int absentNum = 0;
        int lateContinous = 0;
        int maxLate = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if ('A' == cur) {
                absentNum++;
            }
            if ('L' != cur) {
                maxLate = Math.max(lateContinous, maxLate);
                lateContinous = 0;
            } else {
                lateContinous++;
            }

            if (i == s.length() - 1) {
                maxLate = Math.max(lateContinous, maxLate);
            }
        }
        return absentNum <= 1 && maxLate <= 2;
    }

    public static void main(String[] args) {
        String test001 = "PPALLL";
        String res = new Sharp551().checkRecord(test001) + "";
        System.out.println("res: " + res);
    }
}
