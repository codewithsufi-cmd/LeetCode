class Solution {
    public int sumOfSqOfDig(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,
            fast=n;
        
        while(fast!=1){
            slow=sumOfSqOfDig(slow);
            fast=sumOfSqOfDig(sumOfSqOfDig(fast));

            if(fast==1){
                return true;
            }
            if(fast==slow){
                return false;
            }
        }
        return true;
    }
}