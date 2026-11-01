class Solution {
    public int minMergedInteger(int[] nums) {
        int min =Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i+=2){
            int second=nums[i+1];
            int temp=second;
            int multiplier=10;

            while(temp>=10){
                multiplier*=10;
                temp/=10;
            }
            int merged=nums[i]*multiplier+second;
            if(merged<min){
                min=merged;
            }
        }
        return min;
        
    }
}