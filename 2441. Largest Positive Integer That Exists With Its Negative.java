// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/?envType=daily-question&envId=2024-05-02

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++)
         {
            if(Math.abs(nums[i])==nums[j] && nums[i]<0)
            return nums[j];
         }
           
        }
        return -1;
    }
}
