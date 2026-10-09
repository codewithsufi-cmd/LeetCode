class Solution {
    public void reverse(StringBuilder sb,int i,int j){
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0,
            j=0;
        
        while(i<sb.length() && j<sb.length()){
            char c = sb.charAt(j);
            if(c!=' '){
                j++;
            } else if(c==' '){
                reverse(sb,i,j-1);
                i=j+1;
                j++;
            } if(j==sb.length()){
                reverse(sb,i,j-1);
                break;
            }
        }
        return sb.toString();
    }
}