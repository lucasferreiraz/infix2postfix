package converter;

import structures.Stack;

public class Converter {
    
    //private static String operators[] = {"^", "*", "/", "+", "-"};

    public static Stack<String> converter(String expression){
        String infix[] = expression.split("\\s");

        return parse(infix);
    }

    private static Stack<String> parse(String infix[]){
        Stack<String> stack = new Stack<>(200);
        Stack<String> postfix = new Stack<>(200);

        for(String element : infix){
            switch (element) {
                case "(":
                    stack.push(element);
                    break;
                case ")":
                    String next;
                    while (!(next = stack.pop()).equals("("))
                        postfix.push(next);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    while(!stack.isEmpty() && precendece(stack.peek()) >= precendece(element))
                        postfix.push(stack.pop());
                    stack.push(element);
                    break;
                default:
                    postfix.push(element);
            }
        }

        while(!stack.isEmpty())
            postfix.push(stack.pop());
        
        return postfix;
    }

    private static Integer precendece(String operator){
        switch (operator) {
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
            default:
                return 0;
        }
    }

}
