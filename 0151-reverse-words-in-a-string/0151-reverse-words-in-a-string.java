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
        int l=0,
            r=s.length()-1;
        while(l<s.length() && s.charAt(l)==' '){
                l++;
        }
        while(r>=0 && s.charAt(r)==' '){
                r--;
        }
        //"hello   world"
        StringBuilder sb=new StringBuilder();

       while(l<=r){
        char c=s.charAt(l);
        if(c!=' '){
            sb.append(c);
        } else if(c==' '){
            if(sb.charAt(sb.length()-1)!=' '){
                sb.append(c);
            }
        }
        l++;
       }

       reverse(sb,0,sb.length()-1);

       //"dlrow olleh"

       int i=0,
            j=0;
        
        while(j<sb.length() && i<sb.length()){
            char c=sb.charAt(j);
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