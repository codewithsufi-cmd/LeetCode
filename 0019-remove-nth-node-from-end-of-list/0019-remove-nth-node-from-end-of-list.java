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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0);
            dummy.next=head;
        ListNode l=head;
        int len=0;
        while(l!=null){
            len=len+1;
            l=l.next;
        }

        int d=len-n;
        ListNode prev=dummy,
                curr=head;
        for(int i=0;i<d;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return dummy.next;
    }
}