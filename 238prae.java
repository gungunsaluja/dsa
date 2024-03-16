https://leetcode.com/problems/product-of-array-except-self/description/?envType=daily-question&envId=2024-03-15
//In this question we can use two approach the first approach could be taken more space.First in this question we have to take product of array expect that index and we can
//calculate it by take wo array left array and then right array in left array we will store product of left side while in right array we will store product of right array
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------Approach=1
//in left[0] and right[nums.length-1] = 1 we will store 1 and then we will run two for loop for both first will be for 1 to nums.length and left[i] = left[i-1]*nums[i-1]
//this is how we will calculate left array and for right array we will run loop from nums.length-2 to 0 and right[i] = right[i+1]*nums[i+1];
//ant then we will take array arr and we will store left[i] *right[i] into it 
//-------------------------------------------------------------------------Approach2-------------------------------------------------------------------------------------
//we will note take extra space here we will calculate left array same as we have done previously and then we will initialize rightpro with 1 and then we will run a loop from 
//left.length to 0 and store left[i]*rightpro and update rightpro everytime with rightpro*nums[i] and we will store it in left array and then return it 

//approach 2------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] productExceptSelf(int[] nums) {

     
      int left[] = new int[nums.length];
      left[1] = 1;
      for(int i=1;i<nums.length;i++)
        {
          left[i] = left[i-1]*nums[i-1];
        }
      int rightpro = 1;
      for(int i=left.length-1;i>=0;i--)
        {

          left[i] = left[i] *rightpro;
          rightpro =  rightpro*nums[i];
        }
      return left;
    }
}
// ----------------------------------------------------------------------------------------------------------------------------------------------------------Approach1---------

class Solution {
    public int[] productExceptSelf(int[] nums) {
      int left[] = new int[nums.length];
      int right[] = new int[nums.length];
      left[0] = 1;
      right[nums.length-1]=1;
      for(int i=1;i<nums.length;i++)
        {
          left[i] = left[i-1]*right[i-1];
        }
      for(int i=right.length-2;i>=0;i--)
        {
          right[i]= right[i+1]*nums[i+1];
        }
      int ans[] = new int[nums.length];
      for(int i=0;i<nums.length;i++)
        {
          ans[i] = left[i]*rihgt[i];
        }
      return ans;

    }
}













