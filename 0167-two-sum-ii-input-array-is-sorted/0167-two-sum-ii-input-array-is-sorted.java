class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0,
            j=numbers.length-1;
        while(i<j){
            int a=numbers[i];
            int b =numbers[j];
            if((a+b)>target){
                j--;
            }else if((a+b)<target){
                i++;
            }else if(a+b==target){
                return new int[]{
                    ++i,++j
                };
            }
        }
        return new int[]{
            -1,-1
        };
        
    }
}