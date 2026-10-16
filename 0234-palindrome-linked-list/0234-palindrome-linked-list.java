/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }https://leetcode.com/_next/static/images/dark-pending-f313d6fe32951fb6b4d48ad3ee4f3821.gif$0
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rev(ListNode curr){
        ListNode prev=null;
        ListNode temp=curr;

        while(curr!=null){
            curr=curr.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,
            fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode n1=head;
        ListNode n2=rev(slow);

        while(n1!=null && n2!=null){
            if(n1.val!=n2.val){
                return false;
            }
            n1=n1.next;
            n2=n2.next;
        }

        return true;


    }
}