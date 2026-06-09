
class Solution {
    public Node copyRandomList(Node head) {
        // three steps
        //insert copy nodes of previous nodes val btw two original node
        // set random pointer 
        // separate list like copied lement form the new list 

        if(head == null){
            return head;
        }

    // 1 insert copy nodes, copy values of nodes in copy node and place next to original copied node

        Node curr = head;
        while( curr != null){
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        //2 set random pointer from original into copied nodes
         curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        //3 separate copy list from original list
        
         curr = head;
        Node dummy = new Node(0);
        Node copycurr = dummy;
        while(curr != null){
             Node copy = curr.next;
             curr.next = copy.next;

             copycurr.next = copy;
             copycurr = copy;
             curr = curr.next;
        }
        return dummy.next;
    }
}
