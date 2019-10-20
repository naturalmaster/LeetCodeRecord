import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangFuJin
 * @date 2019/10/20 9:52
 * mail: naaturalmaster@gmail.com
 */
public class NumSum01 {

    public static void main(String[] args){
        int[] nums = {2, 2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
        int[] result2 = hashSolution(nums, 9);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

    /**
     * 暴力破解
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            for (int j = i + 1; j< nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] hashSolution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}   
