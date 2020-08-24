//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 
// 👍 1191 👎 0


package com.kerui.leetcode.editor.cn;

public class P9_PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new P9_PalindromeNumber().new Solution();
        long startTime = System.nanoTime();
        boolean palindrome = solution.isPalindrome(0);
        long endTime = System.nanoTime();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ns" + "-----" + "[" + palindrome + "]");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0 || x % 10 == 0 && x != 0) {
                return false;
            }
            /*int num = 0;
            int record = x;
            int remainder;
            while (x > 0 ) {
                remainder = x % 10;
                num = num * 10 + remainder;
                x /= 10;
            }
            if (num == record) {
                return true;
            } else {
                return false;
            }*/

            int revertedNumber = 0;
            while (x > revertedNumber) {
                revertedNumber = revertedNumber * 10 + x % 10;
                x /= 10;
            }
            return x == revertedNumber || x == revertedNumber / 10;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}