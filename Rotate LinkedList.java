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
