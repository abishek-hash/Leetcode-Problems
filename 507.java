class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;
        int n = isNegative ? -num : num;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int remainder = n % 7;
            sb.append(remainder);
            n = n / 7;
        }

        if (isNegative) {
            sb.append('-');
        }

        return sb.reverse().toString();
    }
}