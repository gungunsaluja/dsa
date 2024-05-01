// https://leetcode.com/problems/reverse-prefix-of-word/


class Solution {
    public String reversePrefix(String word, char ch) {
        int m =0;
        StringBuilder sb = new StringBuilder();
       int flag=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                sb.append(word.charAt(i));
                    m=i;
                    flag=1;
                break;
            }
            sb.append(word.charAt(i));
        }
        if(flag!=0){
        StringBuilder sb1 = sb.reverse();
        for(int i=m+1;i<word.length();i++){
            sb1.append(word.charAt(i));
        }
        return sb1.toString();
        }
        return sb.toString();
    }
}
