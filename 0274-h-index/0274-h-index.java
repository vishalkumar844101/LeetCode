import java.util.Arrays;
class Solution {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int maxH = 0;
        Arrays.sort(citations);
        for(int i = 0; i<n; i++){
            if(citations[i]>=n-i){
                maxH = Math.max(maxH ,n-i);
            }
        }
        return maxH;
        
    }   
    
}