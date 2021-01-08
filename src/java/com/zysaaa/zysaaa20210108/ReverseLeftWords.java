package com.zysaaa.zysaaa20210108;

import java.util.Arrays;

/**
 * @description: 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * @author:zysaaa
 * @date: 2021/1/8 19:24
 */
public class ReverseLeftWords {

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));  //使用字符串翻转。
    }

    private static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

}
