package com.yxl.learning.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：两数之和
 * 给定一个整数数组input[]和一个目标值target
 * 从数组中寻找两个数，其和为目标值
 * 返回此两数的数组下标
 * 每种输入只有一个答案、且数组里每个数只能使用一次
 */
public class Task20200907A {

    public static int[] execute(int[] nums, int target) {
        return twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
