package com.zysaaa.zysaaa20210215;

import com.zysaaa.common.ListNode;

import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/partition-list/
 */
public class Partition {
    public static void main(String[] args) {
    }
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode other = new ListNode(0);

        ListNode head1 = small;
        ListNode head2 = other;

        while (head != null) {
            if (head.val < x) {
                head1.next = head;
                ListNode next = head.next;
                head.next = null;
                head = next;
                head1 = head1.next;
            } else {
                head2.next = head;
                ListNode next = head.next;
                head.next = null;
                head = next;
                head2 = head2.next;
            }
        }
        head1.next = other.next;
        return small.next;
    }
}
