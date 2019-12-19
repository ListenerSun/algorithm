package com.sqt;

import java.util.Arrays;

/**
 * @Description:给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-19 23:52
 */
public class LeetCode_242 {

    public static void main(String[] args) {
//        char[] c1 = {'a','s','p','h','1'};
//        char c2 = '2';
//        char c3 = '2';
//        int i = 2;
//        System.out.println(c2 == i);
//        System.out.println(c2 == c3);
//        Integer a = 10;
//        int b = 10;
//        System.out.println(a == b);
//        Arrays.sort(c1);
//        System.out.println(c1);
        char c1 = 'a';
        char c2 = 'c';
        System.out.println(c2 - c1);
    }

    /**
     * 排序后比较
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);

    }

    /**
     * 排序后比较
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s1[i] - 'a']++;
            arr[t1[i] - 'a']--;
        }
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
