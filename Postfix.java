public class Postfix {
    public static String postFix(String infix){
        Stack<Character> stack = new Stack<>();
        String post = "";
        for (int i = 0;i<infix.length();i++) {
            char symbol = infix.charAt(i);
            if (symbol == '(') {
                stack.push(symbol);
            } else if (symbol == ')') {
                char previous = stack.pop();
                while (previous != '(') {
                    post+=previous;
                    previous = stack.pop();
                }
            } else if (symbol == '^' || symbol == '*' || symbol == '/' || symbol == '+' || symbol == '-') {
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(symbol)) {

                    post+=stack.pop();

                }

                stack.push(symbol);
            }else {
                post+=symbol;

            }
        }

        while (!stack.isEmpty()) {
            post+=stack.pop();

        }

        return post;
    }
    public static int priority(char symbol){
        if(symbol=='^')
            return 3;
        else if(symbol=='*' || symbol=='/')
            return 2;
        else if(symbol=='+' || symbol=='-')
            return 1;

        return 0;
    }
    public static void main(String[] args) {


        System.out.println( postFix("a/b-(c+d)*e-(a*c)"));
    }
}
