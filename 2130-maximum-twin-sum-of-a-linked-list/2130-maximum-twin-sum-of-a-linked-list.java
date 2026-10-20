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
                fast=head.next;

        if(slow.next.next==null){
            return slow.val+slow.next.val;
        }

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode ptr2=rev(slow.next),
                ptr1=head;

        int max=(ptr1.val)+(ptr2.val);

        while(ptr1!=null && ptr2!=null){
            if((ptr1.val+ptr2.val)>max){
                max=ptr1.val+ptr2.val;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        return max;
    }
}