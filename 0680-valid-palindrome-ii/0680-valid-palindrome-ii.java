class Solution {
    public boolean validPalindromeHelper(String s,int i,int j) {
        while(i<j){
            
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            } 
                i=i+1;
                j=j-1;
            
        }
        return true;
        }
    
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char left=s.charAt(i),
            right=s.charAt(j);

            if(left != right){
                //use super power
                return (validPalindromeHelper(s,i+1,j) || validPalindromeHelper(s,i,j-1)); 

            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}