class Solution {
    public int lengthOfLastWord(String s) {
        
        String subString[] = s.trim().split("\\s+");
        int i = subString.length-1;

        return subString[i].length();
        
    }
}