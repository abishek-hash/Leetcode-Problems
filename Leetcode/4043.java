class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int equalpairs=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                equalpairs++;
            
            }
        }
        int answer =0;
        if(k==equalpairs-1){
            answer+=equalpairs;
        }
        if(k==equalpairs){
            answer+=n-equalpairs;
        }
        return answer;
        
    }
}