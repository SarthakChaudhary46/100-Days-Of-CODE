
class Solution {
    public String minRemoveToMakeValid(String s) {
        // Initialize pointers for the start and end of the string
        int startPointer = 0;
        int endPointer = s.length() - 1;

        String result;

        // Convert input string to character array for easier manipulation
        char[] arr = s.toCharArray();
        
        // Counter for open parentheses
        int openParenthesesCount = 0;

        // First pass: mark excess closing parentheses with '*'
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                openParenthesesCount++;
            else if (arr[i] == ')') {
                if (openParenthesesCount == 0)
                    arr[i] = '*'; // Mark excess closing parentheses
                else
                    openParenthesesCount--;
            }
        }

        // Second pass: mark excess opening parentheses from the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (openParenthesesCount > 0 && arr[i] == '(') {
                arr[i] = '*'; // Mark excess opening parentheses
                openParenthesesCount--;
            }
        }
        
        // Filter out marked characters and store the result in the character array
        int p = 0; // Pointer for updating the character array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*')
                arr[p++] = arr[i];
        }

        // Construct the result string from the filtered character array
        result = new String(arr).substring(0, p);

        return result;
    }
}
