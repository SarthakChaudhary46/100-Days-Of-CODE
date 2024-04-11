class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        
        // Remove remaining k digits from the end of the stack
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        // Construct the resulting string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse(); // Reverse to get the correct order
        
        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        // Handle edge case where result might be empty
        return sb.length() > 0 ? sb.toString() : "0";
    }
}
