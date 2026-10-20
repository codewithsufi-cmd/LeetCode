class Solution {
    public int findNumbers(int[] nums) {
        int dig=0,eve_dig=0;

        for(int n:nums){
            if(n==0){
                return 1;
            }
            while(n>0){
                n=n/10;
                dig++;
            }
            if(dig%2==0){
                eve_dig++;
            } else{
                dig=0;
            }
        }

        return eve_dig;


    }
}