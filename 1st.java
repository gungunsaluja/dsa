 // leet code => 2971. Find Polygon With the Largest Perimeter
import java.util.*;
class sol{
  public long peri(int nums[]){
    long ans = -1;
    long prevSum =0;
    Arrays.sort(nums);
    for(int num :nums){
      if(prevSum>num){
        ans = prevSum +num;
      }
      prevSum+=num;
    }
    return ans;
  }
}
