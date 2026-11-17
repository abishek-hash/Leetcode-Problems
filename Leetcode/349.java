class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    boolean[] seen = new boolean[1001];
        for (int num : nums1) {
            seen[num] = true;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (seen[num]) {
                list.add(num);
                seen[num] = false; // Reset to avoid duplicates in the result
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}