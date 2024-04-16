
// 1750. Minimum Length of String After Deleting Similar Ends
// in this queston we have to calculate a string which we will get after deleting similar ends  for doing so we will use two pointer approach. And we will take two pointer and 
//that is low and high  initially low will point to starting index and high will pointer to ending index and we will run a while loop till low<=high and characters at both end 
// should be equal if they are not same simply we will return high - low + 1  and if they are same then we will run two more while loop  store the char in ch
// one loop is for calculating the prefix and one loop is for calculating the suffix we will give condition as low<=high && 
//s.charAt(low) == ch this is for prefix and for suffix we will give condition as s.charAt(high)==ch && low<=high
//and at the end we will return high-low+1;
class Solution {
    public int minimumLength(String s) {
      int low = 0;
      int high = s.length()-1;
      while(low<=high && s.charAt(low)==s.charAt(high)){
            char ch = s.charAt(low);
        while(low<=high && s.charAt(low)==ch){
          low++}
        while(low<=high && s.charAt(high)==ch){
          high--}        
      }
      return high - low +1;
    }
}
