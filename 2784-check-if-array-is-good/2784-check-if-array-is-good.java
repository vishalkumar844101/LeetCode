class Solution {
    public boolean isGood(int[] nums) {

        int n = nums.length;

        if (n < 2) {
            return false;
        }

        for (int i = 1; i <= n - 1; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }

            if (i == n - 1) {
                if (count != 2) {
                    return false;
                }
            } else {
                if (count != 1) {
                    return false;
                }
            }
        }

        return true;
    }
}