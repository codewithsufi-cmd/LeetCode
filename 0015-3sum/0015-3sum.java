class Solution {
    public void twosumhelper(int f,int nums[],List<List<Integer>> res){
            int i=f+1,
                j=nums.length-1;
                while(i<j){
                    int sum=nums[f]+nums[i]+nums[j];
                    if(sum<0){
                        i++;
                    } else if(sum>0){
                        j--;
                    } else{
                        res.add(Arrays.asList(nums[f],nums[i],nums[j]));
                        i++;
                        j--;
                        while(i<j && nums[i]==nums[i-1]){
                            i++;
                        }
                        while(i<j && nums[j]==nums[j+1]){
                            j--;
                        }
                        }
                    }
                }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res =  new ArrayList<>();
        for(int f=0;f<nums.length-1;f++){
            if(nums[f]>0){
                break;
            }
            if(f==0 ||(nums[f]!=nums[f-1])){
                twosumhelper(f, nums ,res);
            }
        }
        return res;
    }
}