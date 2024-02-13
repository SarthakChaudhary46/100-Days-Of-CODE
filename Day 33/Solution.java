class Solution {
    public String firstPalindrome(String[] words) {
        String res = "";

        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            int j = 0;
            int end = temp.length() - 1;
            int count = 0;

            while (j < end) {
                if (temp.charAt(j) == temp.charAt(end)) { // Use 'j' instead of 'i'
                    j++;
                    end--;
                    count++;
                } else {
                    break; // Break the loop if characters don't match
                }
            }

            if (j >= end) { // Check if the entire word is a palindrome
                res = temp;
                break; // Break the loop if a palindrome is found
            }
        }
        return res;
    }
}

