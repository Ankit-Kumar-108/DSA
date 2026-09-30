
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);){
            System.out.println("Enter a number");
            double num1 = input.nextDouble();

            System.out.println("Enter Another number");
            double num2 = input.nextDouble();
            double result = 0;
            
            while (true) { 
                System.out.println("Enter the operator");
                char op = input.next().trim().charAt(0);
                
                if(op == '/' || op == '*' || op == '+' || op == '-'){
                    if (op == '/') {
                        if(num2 == 0){
                            System.out.println("Invalid Operand");
                        } else {
                        result = num1 / num2;
                        }
                    }

                    if (op == '*') {
                        result = num1 * num2;
                    }

                    if(op == '+'){
                        result = num1 + num2;
                    }

                    if(op == '-'){
                        result = num1 - num2;
                    }

                } else if(op == 'x' || op == 'X'){
                    System.out.println("Invalid Operator");
                    break;
                }else {
                    System.out.println("Invalid Operator");
                }
                System.out.println("Result " + result);
            }
        }
    }
}