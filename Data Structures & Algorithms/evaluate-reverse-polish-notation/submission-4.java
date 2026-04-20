class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> result = new Stack<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                result.push(token);
            } else {
                int b = Integer.parseInt(result.pop());
                int a = Integer.parseInt(result.pop());

                result.push(calculate(a, b, token));
            }
        }

        return Integer.parseInt(result.pop());
    }

    public static boolean isNumber(String str) {
         return str.matches("-?\\d+");
    }
    
    public static String calculate(int a, int b, String operator) {
         return String.valueOf(switch (operator) {
             case "+" -> a + b;
             case "-" -> a - b;
             case "*" -> a * b;
             case "/" -> {
                 if (b == 0) {
                     throw new ArithmeticException("Division by zero");
                 }
                 yield a / b;
             }
             default -> throw new IllegalArgumentException("Unknown operator: " + operator);
         });
    }
}
