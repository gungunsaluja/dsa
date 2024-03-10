

// 2535. Difference Between Element Sum and Digit Sum of an Array https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/

class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0;
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int m = nums[i];
            while(m>0){
                
           r += m%10;
            m=m/10;
            }


        }
        return Math.abs(r-sum);

        
    }
}
