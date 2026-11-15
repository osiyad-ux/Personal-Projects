import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert the first number: ");
        float x = input.nextFloat();
        System.out.println("Please add an operator either +, -, *, /");
        String operator = input.nextLine();
        System.out.println("Please insert the second number");
        float y = input.nextFloat();
        float sum = 0;




        public add(float x, float y) {
            sum = x + y;
        }

        public subtract(float x, float y) {
            sum = x - y;
        }

        public multiply(float x, float y) {
            sum = x * y;
        }

        public divide(float x, float y) {
            sum = x / y;
            
        }


        Float result = switch (operator) {
            case "+" ->
                    sum = add(x, y);
            case "-" ->
                    sum = subtract(x, y);
            case "*" ->
                    sum = multiply(x, y);
            case "/" -> {
                    if (y == 0) {
                        System.out.println("You are unable to divide by 0");
                    } else {
                        sum = divide(x, y);
                    }
                }
            default -> 
                    System.out.println("Please insert a valid operator");
                    

        };

        




    }

     
    
}