class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(', '[', '{' -> stack.push(c);
                case ')', ']', '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char stackTop = stack.pop();
                    
                    if ((c == ')') && stackTop != '(' || 
                            (c == ']') && stackTop != '[' ||
                            (c == '}') && stackTop != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
