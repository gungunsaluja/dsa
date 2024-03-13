2485. Find the Pivot Integer href = https://leetcode.com/problems/find-the-pivot-integer/description/?envType=daily-question&envId=2024-03-13
//In this question we have to find the pivot element where sum of left side of pivot element including that element and sum fo the right side of the  pivot element including 
//the pivot element .to do so one approach could be to do by mathematics where you have to find sum till nth term then calculate its sqrt and take its int only then if 
// sqrt of that int is equal to sum return true else return false;
//one approch could be binary search where we have to take low as 0 and high as n then we will run a loop while(low<=high) and mid = (low+high)/2
// then we will take two sum sum1 and sum2  where sum1 =  mid*(mid+1) and sum2 = n*n+1/2 -sum1 + mid if(sum1==sum2)return mid;
//else if(sum1<sum2) low = mid+1 else(high = mid-1) 
class Solution {
    public int pivotInteger(int n) {
      int sum = n*(n+1)/2;
      int pivot = (int)Math.sqrt(sum);
      return pivot*pivot ==sum?return pivot :-1;
    }
}

class Solution {
    public int pivotInteger(int n) 
  {
    int low = 1 ;
    int high = n;
    while(low<=high)
    {
      
      int mid = (low+high)/2;
      int sum = mid*(mid+1)/2;
      int sum2 = n*(n+1)/2 - sum + mid;
      if(sum == sum2)
      {
return mid;
      }
      else if(sum<sum2)
      {
        low = mid +1;
      }
      else{
        high = mid -1
      }
      
    }
    
    
  return -1;
}}











