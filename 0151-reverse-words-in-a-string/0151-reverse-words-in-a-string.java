class Solution {
    public static void reverse(StringBuilder s2,int i,int j){
        
        while(i<j){
            char temp=s2.charAt(i);
            char c2=s2.charAt(j);
            
            s2.setCharAt(i,c2);
            s2.setCharAt(j,temp);
            
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        int i=0,
            j=s.length()-1;

        //"  hello   world   "

        while(i<s.length()){
            if(s.charAt(i)==' '){
                i++;
            } else{
                break;
            }
        }

         while(j>=0){
            if(s.charAt(j)==' '){
                j--;
            } else{
                break;
            }
        }

        //"  hello world    "
        //   i         j

        StringBuilder s1=new StringBuilder();

        // "the   hello"
        //      i
        //            j
        //  "the hello"

        while(i<=j){
            char c=s.charAt(i);
            if(c!=' '){
                s1.append(c);
                i++;
            } else if(c==' '){
                if(s1.charAt(s1.length()-1)!=' '){
                    s1.append(' ');
                    i++;
                } else{
                    i++;
                }
            }
        }

        //  "the hello"

        reverse(s1,0,s1.length()-1);

        int l=0,
            r=0;
        while(r<s1.length() && l<s1.length()){
            if(s1.charAt(r)!=' '){
                r++;
            } else if(s1.charAt(r)==' '){
                reverse(s1,l,r-1);
                l=r+1;
                r++;
            } if(r==s1.length()){
                reverse(s1,l,r-1);
                break;
            }
        }

        //  "0lleh eht"


        String res=s1.toString();
        return res;

    }
}