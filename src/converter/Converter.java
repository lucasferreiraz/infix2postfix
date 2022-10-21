package converter;

public class Converter {
    
    private static String operators[] = {"^", "*", "/", "+", "-", "(", ")"};

    private static Boolean isOperator(String operator){
        for(String op : operators){
            if(operator == op){ return true; }
        }
        return false;
    }

}
