
import java.util.Scanner;


public class problems {
    public static void main(String[] args) {
        // Maximum value check
        // int a = 10;
        // int b = 20;
        // int c = 30;

        // int max = a;
        // if (b > max){
        // max = b;
        // }

        // if (c > max){
        // max = c;
        // }

        // int max = Math.max(c, Math.max(a,b));

        // System.out.println(max);


        // CaseCheck 
        // System.out.println("Enter A Character to check its Case");
        // Scanner input = new Scanner(System.in);
        // char ch = input.next().trim().charAt(0);
        //  if (ch >= 'a' && ch <= 'z'){
        //     System.out.println("Lowercase");
        //  }else{
        //     System.out.println("Uppercase");
        //  }

        // Fibonacci Number 

        // try (Scanner input = new Scanner(System.in);){
        //     System.out.println("Enter A number to Find its Fibnocci Number");
        //     int n = input.nextInt();
        //     int a = 0;
        //     int b = 1;
            // if (n>=0){System.out.println(a);}
            // if (n>=1){System.out.println(b);}
        //     int count = 2;

        //     while(count <= n){
        //         int temp = b;
        //         b = b + a;
        //         a = temp;
        //         count++;
        //     }
        //     System.out.println(b);
        // }


        // Number Reoccurance

        // try (Scanner input = new Scanner(System.in);){
        //     System.out.println("Enter the number in which you want to find reoccuring digit");
        //     int num = input.nextInt();

        //     System.out.println("Enter digit to find its reoccurance");
        //     int reocc = input.nextInt();

        //     int count = 0;

        //     while (num > 0) {
        //         int lastDigit = num % 10;
        //         if (lastDigit == reocc){
        //             count++;
        //         }
        //         num = num / 10;
        //     }
        //         System.out.println("The reoccurance of " + reocc + " is " + count + " times" );
        // }

        // Reversing the number 

        try (Scanner input = new Scanner(System.in);){
            System.out.println("Enter a Number to Reverse it.");
            int num = input.nextInt();
            int orderChanged = 0;

            while (num > 0){
                int lastDigit = num % 10;
                orderChanged = (orderChanged * 10) + lastDigit;
                num = num / 10;
            }
            System.out.println(orderChanged);
        }
    }
}
