package converter;

import structures.Stack;

public class Converter {
    
    private static String operators[] = {"^", "*", "/", "+", "-"};
    private static Stack<String> stack = new Stack<>(200);
    private static Stack<String> postfix = new Stack<>(200);

    public static Stack<String> converter(String expression){
        String infix[] = expression.trim().split("\\s");


        return postfix;
    }

    private static String isOperator(String element){
        for(String op : operators){
            if(element.equals(op)){ return element; }
        }
        return null;
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
