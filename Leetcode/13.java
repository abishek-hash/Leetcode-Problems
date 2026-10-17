class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'I') sum += 1;
            else if (ch == 'V') sum += 5;
            else if (ch == 'X') sum += 10;
            else if (ch == 'L') sum += 50;
            else if (ch == 'C') sum += 100;
            else if (ch == 'D') sum += 500;
            else if (ch == 'M') sum += 1000;

            if (i > 0) {
                if (s.charAt(i) == 'V' && s.charAt(i - 1) == 'I') sum -= 2;
                else if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'I') sum -= 2;
                else if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'X') sum -= 20;
                else if (s.charAt(i) == 'C' && s.charAt(i - 1) == 'X') sum -= 20;
                else if (s.charAt(i) == 'D' && s.charAt(i - 1) == 'C') sum -= 200;
                else if (s.charAt(i) == 'M' && s.charAt(i - 1) == 'C') sum -= 200;
            }
        }

        return sum;
    }
}