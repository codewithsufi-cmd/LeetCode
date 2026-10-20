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
    public ListNode rev(ListNode curr){
        ListNode temp=curr,
                prev=null;

        while(curr!=null){
            curr=curr.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head,
                fast=head;

        if(slow.next.next==null){
            return slow.val+slow.next.val;
        }

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode ptr2=rev(slow),
                ptr1=head;

        int maximum=Integer.MIN_VALUE;

        while(ptr1!=null && ptr2!=null){
            int sum = ptr1.val+ptr2.val;
            maximum=Integer.max(maximum,sum);
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        return maximum;
    }
}