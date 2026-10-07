class Solution {
    public int[] numberGame(int[] nums) {
     Arrays.sort(nums);
     int []arr=new int[nums.length];
     int j=0;
     for(int i=0;i<nums.length;i+=2){
        arr[j]=nums[i+1];
        arr[j+1]=nums[i];
        j+=2;
     } 
     return arr;  
    }
}