class Solution {

    

     public ListNode findMid(ListNode head){

            ListNode slow=head;
            ListNode fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            return slow;
    }

    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null){
            return true;
        }
       

        ListNode mid=findMid(head);

        //2.reverse rhs ll

        ListNode prev=null;
        ListNode curr=mid;
        ListNode next;

        while(curr!=null){
            next=curr.next;//sabse pahle next ko uski space di
            curr.next=prev;//prev ko uski jagah pahuvha diya
            prev=curr;//aage bad gaye prev ko current bana diya
            curr=next;
            
        }
        ListNode right=prev;
        ListNode left=head;
        

        //3.Check whether left half==roight half

        while(right!=null){
            if(left.val!=right.val){
                return false;
            }

            left=left.next;
            right=right.next;
        }


        return true;

        

        
    }
}
