class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k == 0 || head == null || head.next == null){
            return head;
        }

        int n = 1;
        ListNode tail = head;

        while(tail.next != null){
            tail = tail.next;
            n++;
        }

        k = k % n;
        if(k == 0){
            return head;
        }

        tail.next = head;

        int index = n - k - 1;
        ListNode newtail = head;

        while(index > 0){
            newtail = newtail.next;
            index--;
        }

        ListNode newhead = newtail.next;
        newtail.next = null;  // tto break the cycle 

       return newhead;
    }
}
