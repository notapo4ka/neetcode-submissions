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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode prevGroup = dummy;

        while (true) {
            ListNode kth = getKth(prevGroup, k);

            if (kth == null) {
                break;
            }

            ListNode nextGroup = kth.next;
            ListNode prev = nextGroup;
            ListNode current = prevGroup.next;

            while (current != nextGroup) {
                ListNode node = current.next;
                current.next = prev;
                prev = current;
                current = node;
            }

            ListNode node = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = node; 
        }
        return dummy.next;
    }

    private ListNode getKth(ListNode current, int k) {
        while (current != null && k > 0) {
            current = current.next;
            k--;
        }
        return current;
    }
}
