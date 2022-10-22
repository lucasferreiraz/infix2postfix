import java.util.Scanner;

import converter.Converter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Type the expression in infix format: ");
        String expression = input.nextLine();

        System.out.println(Converter.converter(expression));

        input.close();
    }
}
