class Solution {
    public int findDuplicate(int[] nums) {
        // 1 3 4 2 2 
        // 0 1 2 3 4 
        
        int slow=0,
            fast=0;

        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];

            if(slow==fast){
                break;
            }
        }

        int n1=0,
            n2=slow;

        while(n1!=n2){
            n1=nums[n1];
            n2=nums[n2];
        }

        return n1;


    }
}