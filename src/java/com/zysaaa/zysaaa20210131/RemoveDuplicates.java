package com.zysaaa.zysaaa20210131;

import java.util.Stack;

/**
 * @description: 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 *
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 *
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 *
 *  
 *
 * 示例：
 *
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 *  
 *
 * 提示：
 *
 * 1 <= S.length <= 20000
 * S 仅由小写英文字母组成。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string
 * @author:zysaaa
 * @date: 2021/1/31 15:34
 */
public class RemoveDuplicates {

    public String removeDuplicates(String S) {

        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!stack.isEmpty() &&  stack.peek() == chars[i]) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();

    }
}
