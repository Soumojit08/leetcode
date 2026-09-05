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
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int n = 0;
        // while(temp != null){
        //     temp = temp.next;
        //     n++;
        // }

        // int mid = Integer.MIN_VALUE;
        // if (n % 2 == 0) {
        //     mid = (n+1) / 2;
        // } else {
        //     mid = n/2;
        // }

        // temp = head;
        // for(int i=1; i<=mid; i++){
        //     temp = temp.next;
        // }

        // return temp;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            fast = fast.next; // first 1 step 
            if (fast != null) { // if fast not null in next step then go another step
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
}