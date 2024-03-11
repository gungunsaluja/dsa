791. Custom Sort String
//https://leetcode.com/problems/custom-sort-string/description/?envType=daily-question&envId=2024-03-11
//   You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.
// Permute the characters of s so that they match the order that order was sorted. More specifically, if a character x occurs before a 
//character y in order, then x should occur before y in the permuted string.
// Return any permutation of s that satisfies this property.
  //here first we will take freqncymap to store the freqncy of every character in the main string then comare it with order and in which order , order is given append the 
  //elements of frequecymap into str then left elements of freqncymap will be appended at the last
  class Solution {
    public String customSortString(String order, String s) {
      HashMap<Character,Integer> frequencyMap = new HashMap<>();
      for(char ch :s.toCharArray())
      {
        frequencyMap.put(ch,frequencyMap.getOrDefaul(ch,0) + 1);
      
    }
      StringBuilder str = new StringBuilder();
      for(char ch : order.toCharArray()){
        if(frequencyMap.containsKey(ch))
        {
          int frequency = frequencyMap.get(ch);
          for(int i=0;i<frequency;i++)
          {
            str.append(ch);
            frequencyMap.put(ch,frequencyMap.get(ch)-1);
          }
          
        }
        
      }
      for(char ch: frequencyMap.keySet()
          {
        int frequency = frequencyMap.get(ch);
        for(int i=0;i<frequency;i++)
          {
            str.append(ch);
          }
      }
      return str.toString();
      
  
}


}








