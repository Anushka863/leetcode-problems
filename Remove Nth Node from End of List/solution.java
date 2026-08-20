class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //calculate size
        int sz=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        //agar mujhe piche se 5th elemnt ko hatana hai aur mera size bhi 5 hi hai

        if(n==sz){
            return head=head.next;
            
        }

        //sz-n
        int i=1;
        int iToFind=sz-n;

        ListNode prev=head;

        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

        return head;
        

        
    }
}
