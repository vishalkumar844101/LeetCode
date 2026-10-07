import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();

        int left = 0, right = 0;

        // Count invalid parentheses
        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                if (left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        solve(s, 0, left, right, 0, new StringBuilder(), ans);

        return ans;
    }

    private void solve(String s, int index, int left,
                       int right, int balance,
                       StringBuilder sb, List<String> ans) {

        if (balance < 0) return;

        if (index == s.length()) {
            if (left == 0 && right == 0 && balance == 0) {
                String str = sb.toString();

                if (!ans.contains(str)) {
                    ans.add(str);
                }
            }
            return;
        }

        char c = s.charAt(index);

        // Remove
        if (c == '(' && left > 0) {
            solve(s, index + 1, left - 1, right,
                  balance, sb, ans);
        }

        if (c == ')' && right > 0) {
            solve(s, index + 1, left, right - 1,
                  balance, sb, ans);
        }

        // Keep
        sb.append(c);

        if (c == '(') {
            solve(s, index + 1, left, right,
                  balance + 1, sb, ans);
        } 
        else if (c == ')') {
            solve(s, index + 1, left, right,
                  balance - 1, sb, ans);
        } 
        else {
            solve(s, index + 1, left, right,
                  balance, sb, ans);
        }

        sb.deleteCharAt(sb.length() - 1);
    }
}