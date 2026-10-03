class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;

        for(int i=0;i<nums.length;i++){
          elementsum=elementsum+nums[i];
          int num=nums[i];
        
        while(num>0){
            int r=num%10;
            digitsum=digitsum+r;
            num=num/10;
        }
        }
        return elementsum-digitsum;

    }
}