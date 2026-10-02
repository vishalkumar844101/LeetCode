import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        solve(n, 0, 0, "", ans);

        return ans;
    }

    public void solve(int n, int open, int close,
                      String str, List<String> ans) {

        // Complete valid combination
        if (open == n && close == n) {
            ans.add(str);
            return;
        }

        // Add opening bracket
        if (open < n) {
            solve(n, open + 1, close, str + "(", ans);
        }

        // Add closing bracket
        if (close < open) {
            solve(n, open, close + 1, str + ")", ans);
        }
    }
}