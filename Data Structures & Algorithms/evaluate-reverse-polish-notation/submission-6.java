class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (isDigit(token)) {
                stack.push(token);
            } else {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());

                switch (token) {
                    case "+" -> stack.push(String.valueOf(a + b));
                    case "-" -> stack.push(String.valueOf(a - b));
                    case "*" -> stack.push(String.valueOf(a * b));
                    case "/" -> stack.push(String.valueOf(a / b));
                }
            }
        }

        return Integer.parseInt(stack.pop());
    }

    private boolean isDigit(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
