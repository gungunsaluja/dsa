https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/

// in this question we have to store only uniqe elements and also we can say that we will contain only those who have freqency equals to 1
// so for doing this we will maintain two ListNode variable temp and fake 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode temp = head;
       ListNode fake = null;
       while(temp!=null)
       {
        if(temp.next!=null && (temp.val==temp.next.val))
        {
            int k = temp.val;
            while(temp!=null && temp.val==k){
                temp = temp.next;
            }
            if(fake!=null){
                fake.next = temp;
            }
            else{
                head = temp;
            }

        }
        else{

            fake = temp;
            temp = temp.next;
        }

       }

return head;


      
    }}
