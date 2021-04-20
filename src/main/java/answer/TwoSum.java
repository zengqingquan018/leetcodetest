package main.java.answer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：
 *
 * @author zengqingquan
 * @date 2021/4/15 10:18
 */
public class TwoSum {

    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * <p>
     * 你可以按任意顺序返回答案。
     * <p>
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/two-sum 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (null == nums) {
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (null != map.get(target - a)) {
                result[0] = map.get(target - a);
                result[1] = i;
                break;
            }
            map.put(a, i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 17;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        int[] nums1 = new int[]{3, 2, 4};
        int target1 = 6;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        int[] nums2 = new int[]{3, 3};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
    }


}
