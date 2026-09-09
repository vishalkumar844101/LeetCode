class Solution{
    public static int jump(int nums[]){
        int count = 0;
        int currentReach = 0;
        int Farthest = 0;
        for(int i = 0; i<nums.length-1; i++){
            Farthest = Math.max(Farthest , i + nums[i]);

            if(i == currentReach){
                count++;
                currentReach = Farthest;
            }
        }
        return count;
    }
}