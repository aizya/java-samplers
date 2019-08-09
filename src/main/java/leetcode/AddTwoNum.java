/*
 * *
 *  * Copyright (c) by Shanghai PoleLink Information Technology Co.,Ltd. All rights reserved.
 *  *
 *  * This software is copyright protected and proprietary to Shanghai PoleLink
 *  * Information Technology. Shanghai PoleLink Information Technology Co.,Ltd
 *  * grants to you only those rights as set out in the license conditions.
 *  * All other rights remain with Shanghai PoleLink Information Technology Co.,Ltd.
 *  *
 *  *
 */

package leetcode;

/**
 * Description: 给定一个整数数组 nums 和一个目标值
 * target，请你在该数组中找出和为目标值的那 两个整数(整数分为正整数和负整数)，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: xiaoxiong
 * @Date: 19-8-9 21:33
 */
public class AddTwoNum {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;

		int[] ints = twoSum(nums, target);
		System.err.println(ints);
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int idx = checkEquals(nums, i, target);
			if (idx != -1) {
				if (i < idx) {
					return new int[] { i, idx };
				} else {
					return new int[] { idx, i };
				}
			}
		}
		return new int[] {};
	}

	private static int checkEquals(int[] nums, int i, int target) {
		int idx = -1;
		for (int j = 0; j < nums.length; j++) {
			if (j == i) {
				continue;
			}
			if (nums[j] + i == target) {
				idx = j;
			}
		}
		return idx;
	}
}
