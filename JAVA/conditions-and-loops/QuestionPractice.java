import java.util.Scanner;

public class QuestionPractice {
    public static void main(String[] args) {
        // Question :- Subtract the Product and Sum of Digits of an Integer
        // int n = 234;
        // int mult = 1;
        // int sum = 0;
        // while (n>0) {
        //     int lastDigit = n % 10;
        //     mult *= lastDigit;
        //     sum += lastDigit;
        //     n = n / 10;

        // }
        // System.out.println("The difference between product and sum of integer is " + (mult - sum));

        // Question :-  Input a number and print all the factors of that number (use loops).
        // int count = 1;
        // while (count <= n) {
        //     if (n % count == 0) {
        //         System.out.println("Factors " + count );
               
        //     }
        //     count++;
            
        // }

        // Question :- Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        // try(Scanner input = new Scanner(System.in);){
        //     System.out.println("Enter int numbers till you enter 0, to add");
        //     int result = 0;
        //     while (true) { 
        //         int nums = input.nextInt();
        //         if (nums != 0 && nums <= 2147483647){
        //             result = result + nums;
        //         } else if (nums == 0) {
        //             System.out.println("Addition ended and the result is " + result);
        //             return;
        //         } else{
        //             System.out.println("Enter valid Integers");
        //         }
        //     }
        // }

        // Question:- Take integer inputs till the user enters 0 and print the largest number from all.
        // try(Scanner input = new Scanner(System.in);){
        //     System.out.println("Enter numbers to find greatest between them until you press 0");
        //     int result = 0;
        //     while (true) {
        //         int greatestNum = input.nextInt();
        //         if (greatestNum == 0){
        //             System.out.println("The Greatest Number was " + result);
        //             break;
        //         }
        //         if (greatestNum > result){
        //             result = greatestNum;
        //         }
        //     }
        // }

        // Question :- Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August

        // int count = 31;
        // int dayToGoOut = 0;
        // for(int days = 1; days <= count; days++) {
        //    if (days % 2 == 0){
        //     dayToGoOut++;
        //    } 
        // }
        // System.out.println("Days you can go out " + dayToGoOut);


        // Question :- Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

        try(Scanner input = new Scanner(System.in);){
            System.out.println("Enter Numbers to find sum of each types of numbers like +ve odd, even and -ve separately");
            int SumOfPosOdd = 0;
            int SumOfPosEven = 0;
            int SumOfNeg = 0;

            while (true) { 
                int num = input.nextInt();
                if (num == 0){
                    System.out.println("Sum Of +ve Odd Numbers " + SumOfPosOdd);
                    System.out.println("Sum Of +ve Even Numbers " + SumOfPosEven);
                    System.out.println("Sum Of -ve Numbers " + SumOfNeg);
                    break;
                } else if (num > 0){
                    if (num % 2 == 0) {
                        SumOfPosEven = SumOfPosEven + num;
                    } else{
                        SumOfPosOdd = SumOfPosOdd + num;
                    }
                } else {
                    SumOfNeg = SumOfNeg + num;
                }
            }

        }
    }
}
