class Solution {
    public int[] buildArray(int[] nums) {
    int n=nums.length;
    for(int i=0;i<nums.length;i++){
        int temp =nums[nums[i]]%n;
          nums[i]=nums[i]+(temp*n);
    }
    for(int i=0;i<n;i++){
        nums[i]=nums[i]/n;
    }
    return nums;

    }
}