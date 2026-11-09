class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer>ans=new ArrayList<>();

        for(int n=left;n<=right;n++){
            int r=n;
            boolean valid=true;

            while(r>0){
                int digit=r%10;

                if(digit==0 ||n%digit!=0){
                    valid =false;
                    break;
                }
                r=r/10;
            }
            if(valid){
                ans.add(n);
            }
        }
        return ans;
    }
}