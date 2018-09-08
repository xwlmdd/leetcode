package com.mdd.learn.add_two_num;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
class ExcellentSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 链表头节点
        ListNode resultNode = new ListNode(0);
        ListNode curr = resultNode;
        int scale = 0;
        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;

            int sum = num1 + num2 + scale;
            scale = sum / 10;

            int nodeVal = sum % 10;

            curr.next = new ListNode(nodeVal);
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (scale > 0) {
            curr.next = new ListNode(scale);
        }
        return resultNode.next;
    }


    public static void main(String[] args) {
        ExcellentSolution solution = new ExcellentSolution();
        ListNode listNode1 = new ListNode(2);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(3);
        listNode1.next = listNode11;
        listNode11.next = listNode12;
        listNode12.next = null;

        ListNode listNode2 = new ListNode(5);
        ListNode listNode21 = new ListNode(6);
        ListNode listNode22 = new ListNode(4);
        listNode2.next = listNode21;
        listNode21.next = listNode22;
        listNode22.next = null;

        ListNode resultNode = solution.addTwoNumbers(listNode1, listNode2);
        while (resultNode != null) {
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }

    }
}