class Solution {
    public int minRotations(String s) {
        int current=0;
        int rotation=0;

        for(int i=0;i<s.length();i++){
            int target=s.charAt(i)-'0';
            int difference=Math.abs(current-target);
            int clockwise=difference;
            int anticlockwise=10-difference;
            rotation+=Math.min(clockwise,anticlockwise);
            current=target;
        }
    return rotation;
    }
}