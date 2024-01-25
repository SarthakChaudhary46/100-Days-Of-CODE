class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() < text2.length()) {
            return LCS(text1, text2);
        }
        return LCS(text2, text1);
    }

    public int LCS(String s1, String s2) {
        int[][] M = new int[2][s1.length() + 1];

        for (int i = 1; i <= s2.length(); i++) {
            M[i % 2][0] = 0;
            for (int j = 1; j <= s1.length(); j++) {
                if (s1.charAt(j - 1) == s2.charAt(i - 1)) {
                    M[i % 2][j] = M[(i - 1) % 2][j - 1] + 1;
                } else {
                    M[i % 2][j] = Math.max(M[(i - 1) % 2][j - 1],
                            Math.max(M[(i - 1) % 2][j], M[i % 2][j - 1]));
                }
            }
        }
        return M[s2.length() % 2][s1.length()];
    }
}

