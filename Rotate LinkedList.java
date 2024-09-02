// The main intuition of the question is that first we need to calculate the length of the linked list so that we can reach
// to its tail node after doing this we need to check that weather k%len==0 and if this condition is true then we dont have do any
// thing because because after rotating k times we will get the same linked list so we will return the same head for this condition
//  after words we have to calculate len -k && k should be k = k%len so that it can handle large values
// then resultant node will point to the null and the next node of it will be head

class Solution {

   
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail = head;
        int len = 1;
        while(tail.next!=null)
        {
            tail = tail.next;
            len++;
        }
        if(k%len==0){
            return head;
        }
        k = k%len;
        tail.next = head;
         int end = len-k;
         while(end--!=0){
            tail = tail.next;
         }
         head = tail.next;
         tail.next=null;
       
        return head;
    }
}
