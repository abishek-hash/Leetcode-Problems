class Solution {
    public int maxFreqSum(String s) {
       int [] freq=new int[26];
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
       } 
       int maxvowel=0;
       int maxconsonant=0;
       for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            maxvowel=Math.max(maxvowel,freq[i]);
        }
        else{
            maxconsonant=Math.max(maxconsonant,freq[i]);
        }
       }
       return maxvowel+maxconsonant;
    }
}