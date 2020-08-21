//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 8942 👎 0

  
package com.kerui.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class P1_TwoSum{
    public static void main(String[] args) {
        Solution solution = new P1_TwoSum().new Solution();
        int[] intArr = {1, 2, 3, 4, 5, 6, 8, 9, 11, 22, 13};
        long startTime = System.currentTimeMillis();//获取开始时间
        long l = System.nanoTime();
        int[] ints = solution.twoSum(intArr, 13);
        long endTime = System.currentTimeMillis();//获取结束时间
        long l1 = System.nanoTime();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms" + "-----" + "[" + ints[0] + "," + ints[1] + "]" );
        System.out.println("程序运行时间： " + (l1 - l) + "ns" + "-----" + "[" + ints[0] + "," + ints[1] + "]" );
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                }
                map.put(nums[i], i);
            }
            return  null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

  }