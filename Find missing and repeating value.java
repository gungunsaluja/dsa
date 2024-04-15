
//coding ninja
//https://www.naukri.com/code360/problems/missing-and-repeating-numbers_6828164?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
      int hash[] = new int[a.length+1];
      int repeating = -1;
      int missing = -1;
      for(int i=0;i<a.length;i++)
        {
          hash[a[i]]++;
        }
      for(int i=1;i<=hash.length;i++)
        {
          if(hash[i]==2){
            repeating = i;
        }
          if(hash[i]==0)
          {
            missing = i;
          }
          if(missing !=-1 && repeating!=-1)
          {
            break;
          }
        
        }
      int ans[] = {repeating,missing};
        return ans;
    
    }
}
