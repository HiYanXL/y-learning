package com.yxl.learning.tasks;

/**
 * 题目：两数相加
 * 两个链表，分别存储一个数字的低位到高位
 * 相加的和值存在一个新的链表
 * 返回和的链表表头
 */
public class Task20200907B {

    public static ListNode execute(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode resHead = res;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 == null) {
                sum = l2.val;
            } else if (l2 == null) {
                sum = l1.val;
            } else {
                sum = l1.val + l2.val;
            }
            sum += res.val;
            boolean b = sum >= 10;
            if (b) {
                res.val = (sum - 10);
                if (res.next == null) {
                    res.next = new ListNode(1);
                } else {
                    res.next.val++;
                }
            } else {
                res.val = sum;
            }
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            if (l1 != null || l2 != null) {
                if (res.next == null) {
                    res.next = new ListNode(0);
                }
                res = res.next;
            }

        }
        return resHead;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }
}

