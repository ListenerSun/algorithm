package com.sqt.字符串;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-29 1:51
 * <p>
 * <p>
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 * 示例:
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 */
public class LeetCode_58 {

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end > 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end <= 0) {
            return 0;
        }
        int start = end;
        while (end > 0 && s.charAt(end) != ' ') {
            end--;
        }
        return start - end + 1;
    }

    public int lengthOfLastWord1(String s) {
        if (s == null) {
            return 0;
        }
        String[] split = s.split(" ");
        if (split.length == 1) {
            return 0;
        }
        return split[split.length - 1].length();
    }
}
