/**
 * 1480. 一维数组的动态和
 */
public class $1480 {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        return nums;
    }
}
