//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找 
// 👍 665 👎 0

  
package com.kerui.leetcode.editor.cn;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P35_SearchInsertPosition{
    public static void main(String[] args) {
        Solution solution = new P35_SearchInsertPosition().new Solution();
        long startTime = System.nanoTime();
        int[] arr = {1,2,3,4,7};
        int i = solution.searchInsert(arr, 5);
        long endTime = System.nanoTime();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ns" + "-----" + "i" + "=" + i);
  }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> ints = IntStream.of(nums).boxed().collect(Collectors.toList());
        if (ints.contains(target))return ints.indexOf(target);
        else {
            ints.add(target);
            Collections.sort(ints);
            ints.forEach(integer -> System.out.print(integer));
            return ints.indexOf(target);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }