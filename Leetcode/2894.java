class Solution {
    public int differenceOfSums(int n, int m) {
        int res=0;
        int ans=0;
        int diff;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                res+=i;
            }
            else{
                ans+=i;
            }
        }
        diff=ans-res;
        return diff;
    }
}