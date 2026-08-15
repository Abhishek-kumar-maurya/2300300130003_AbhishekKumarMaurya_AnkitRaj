/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) {
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;

        // Move temp to left position
        for (int i = 1; i < left; i++) {
            prev = temp;
            temp = temp.next;
        }

        // Save the first node of the section
        ListNode temp2 = temp;

        // Move temp to the right position
        for (int i = left; i < right; i++) {
            temp = temp.next;
        }

        // Save the node after right
        ListNode NextNode = temp.next;

        // Disconnect the section
        temp.next = null;

        // Reverse the section
        ListNode reversedHead = reverseList(temp2);

        // If reversal starts from head
        if (left == 1) {
            temp2.next = NextNode;
            return reversedHead;
        }

        // Connect previous part
        prev.next = reversedHead;

        // Connect reversed part to remaining list
        temp2.next = NextNode;

        return head;
    }
}