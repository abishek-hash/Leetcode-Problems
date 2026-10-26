class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int n=x;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
            if(sum!=0 && x%sum==0){
                return sum;
            
        }
        return -1;

    }
}