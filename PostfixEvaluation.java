import java.util.Scanner;

public class PostfixEvaluation {


    public static int evalPostfix(String express) {


        Stack<Integer> st = new Stack<>();

        char[] ch = express.toCharArray();

        for (int i = 0; i < express.length(); i++) {

            if (ch[i] >= '0' && ch[i] <= '9') /* pushing value into the stack */ //"432*+11-"

                st.push(ch[i] - '0');

            else       /* if the operator comes it will be evaluated */ {
                int value1 = st.pop();
                int value2 = st.pop();
                if (ch[i] == '*')
                    st.push(value2 * value1);
                else if (ch[i] == '/') {
                    st.push(value2 / value1);

                } else if (ch[i] == '+') {
                    st.push(value2 + value1);

                } else if (ch[i] == '-') {
                    st.push(value2 - value1);

                } else if (ch[i] == '^') {
                    st.push((int) Math.pow(value2, value1));

                }


             // result return
            }
        }
        return st.pop();
    }



            // Driver function
            public static void main (String[]args)
            {
                Scanner input = new Scanner(System.in);
                String expression = input.next();
                System.out.println("Postfix evaluation of the given expression comes out to be :" + evalPostfix(expression));
            }



    }
