class Solution {
    public int trap(int[] height) {
        // find LeftMax
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);

        }

        // RightMax

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // trapping water

        int trappedwater = 0;
        for(int i = 0; i<height.length; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;

    }
}