2540. Minimum Common Value
 // link to the question = https://leetcode.com/problems/minimum-common-value/description/?envType=daily-question&envId=2024-03-09
// In this question we have given two arrays nums1 and nums2  and we have to find the minimum common values from both arrays suppose we have [1,2,3,4] and [2,4,6]
  // so here we can see that there are two elements which are common in both 2, 4 but we have to take minimum value so in thisquestion it is given that both arrays are sorted
  // we can solve this question by two approach 
  //taking hashset and second is by using binary search and two pointer approach(This will be optimal solution)
  class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
      HashSet<Integer> set = new HashSet<>();
      for(int num:nums1){
        set.add(num);
      }
      for(int num:nums2){
        if(set.contains(num))
          return num;
      }
      
      return -1;
    }
}
// binary search two pointer approach
  class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
      int i=0;
      int j=0;
      while(i<nums1.length && j< nums2.length)
        {
          if(nums1[i]==nums2[j)
            return nums1[i];
          else if(nums1[i]<nums2[j])
            j++;
          else i++;
        }
            
          
        return -1;
    }
  }








