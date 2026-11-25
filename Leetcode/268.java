    class Solution {
        public int missingNumber(int[] nums) {
            int n=nums.length;
            int expsum=n*(n+1)/2;
            int actuals=0;

            for(int i=0;i<n;i++){
                actuals+=nums[i];
            }
            return expsum-actuals;
        }
    }