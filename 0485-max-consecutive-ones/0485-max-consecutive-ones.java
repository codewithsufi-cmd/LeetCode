class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int i=0,
            count=0,
            Max=Integer.MIN_VALUE;

        while(i<nums.length){
            if(nums[i]==0){
                Max=Integer.max(Max,count);
                count=0;
                i++;
            } else{

                count++;
                i++;

            }
        }
        return Integer.max(Max,count);
    }
}