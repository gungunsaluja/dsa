//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/?envType=daily-question&envId=2024-04-06

// Given a string s of '(' , ')' and lowercase English characters.

// Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

// Formally, a parentheses string is valid if and only if:

// It is the empty string, contains only lowercase characters, or
// It can be written as AB (A concatenated with B), where A and B are valid strings, or
// It can be written as (A), where A is a valid string.

// in this question we have to take a stack  and stack is used to store the index of parenthesis
class Solution {
    public String minRemoveToMakeValid(String s) {

      Stack<Integer> stack = new Stack<>();
      HashSet<Integer> set = new HashSet<>();
      for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='(')
            stack.push(i);
          else if(s.charAt(i)==')')
          {
            if(stack.isEmpty())
            {
              set.add(i);
            }
            else{
              stack.pop();
          }
        }
        }
      while(stack.isEmpty())
        {
          set.add(stack.pop());
        }
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<s.length();i++)
      {
        if(!set.contains(i));
        sb.append(s.charAt(i));
      }
      return sb.toString();
    }
}
