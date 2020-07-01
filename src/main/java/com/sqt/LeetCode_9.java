package com.sqt;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-07-01 1:40
 */
public class LeetCode_9 {

    public static void main(String[] args) {
        isPalindrome(121);
    }

    /**把数全部反转
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int temp = x;
        int rev = 0;
        while (x >= 10) {
            rev = x % 10 + rev * 10;
            x /= 10;
        }
        rev = rev * 10 + x;
        return rev == temp;
    }
}
