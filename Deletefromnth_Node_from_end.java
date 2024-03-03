19. Remove Nth Node From End of List
  // here first we will calculate the size of linkedlist by traversing and using temp node 
  //After when you have calculated the size of linkedlist then you have to check wheather the give node(to be deleted) and size of linkedlist if they are same 
  //means it you want to delete the first element because if(n==5) and size == 5 and for example linkedlist is 1->2->3->4->5
  // Here we can see that our linkedlist has five element and if want to delete 5th element from end then it is clear that you want to delete first element
  //then you have to simply point head's next to head so that current head will be deleted 
  //and if it is not same as size then you have to calculate (iofsz = size-n) then you should take int i =1 and then initialize o while loop till i<iofsz will run and 
  //then take a node prev which is poniting to head prev will be prev = prev.next evertime untill loop will terminate
  //when loop will termintate for eg from above ll our prev will be on 3 then at the end we have make prev.next  = prev.next.next so that 4 will be automatic deleted 
  class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp = head;
      int size = 0;
      while(temp!=null){
        temp=temp.next;
        size++;
    }
      if(size==n){
            head = head.next;
        return head;
      }
      int i =1;
      int iofsz = sz - n;
      ListNode prev = head;
      while(i<iofsz){
        prev = prev.next;
        i++;
      }
      prev.neext = prev.next.next;
      return head;
      
}
