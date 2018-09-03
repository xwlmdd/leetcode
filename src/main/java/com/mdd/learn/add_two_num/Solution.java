package com.mdd.learn.add_two_num;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int listNode1Sum = (int) sumListNode(l1);
        System.out.println("listnode1:" + listNode1Sum);
        int listNode2Sum = (int) sumListNode(l2);
        System.out.println("listnode2:" + listNode2Sum);
        int result = listNode1Sum + listNode2Sum;
        System.out.println(result);
        return null;
    }

    /**
     * 将listNode链表的值按十进制相加
     *
     * @param listNode
     * @return
     */
    private double sumListNode(ListNode listNode) {
        int i = 0;
        double result = 0;
        while (listNode != null) {
            result += listNode.val * (Math.pow(10, i));
            i++;
            listNode = listNode.next;
        }
        return result;
    }

    /**
     * 将一个整数按十进制拆分到链表中
     *
     * @param num
     * @return
     */
    private ListNode convertNumToListNode(int num) {
        int fristNum = num % 10;
        ListNode listNode = new ListNode(fristNum);
        while (num % 10 != 0) {
            num = num / 10;
            ListNode node = new ListNode(fristNum);
        }

        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
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
        solution.addTwoNumbers(listNode1, listNode2);

        System.out.println(807 % 10);

    }
}