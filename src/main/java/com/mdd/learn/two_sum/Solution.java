package com.mdd.learn.two_sum;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Solution {

    /**
     * 方案一：穷举法
     * @param nums   数组
     * @param target 目标值
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        if (nums.length < 2) {
            return resultArray;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (result == target) {
                    resultArray[0] = nums[i];
                    resultArray[1] = nums[j];
                    return resultArray;
                }
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        int[] twoSum = solution.twoSum(nums, target);
        System.out.println(corvetArrayToString(twoSum));
    }

    public static String corvetArrayToString(int[] nums) {
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            result = result + "," + nums[i];
        }
        return result;
    }
}

