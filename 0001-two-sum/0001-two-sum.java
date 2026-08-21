class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        // If no pair found, return empty array or throw exception
        return new int[]{};
    }

    public static void main(String[] args){
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        Solution sol = new Solution();
        int[] result = sol.twoSum(numbers, target);
        if(result.length == 2){
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }
    }
}