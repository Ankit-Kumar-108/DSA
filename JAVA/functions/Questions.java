

// public class Questions {

//     public static void main(String[] args) {
//         // Question ;- Prime numbers
//         // try(Scanner input = new Scanner(System.in);){
//         //     System.out.println("Enter a number to know if its Prime or not!");
//         //     int num = input.nextInt();

//         //     int factors = 0;
//         //     for (int count = 1; count <= num; count++) {
//         //         if (num % count == 0){
//         //             factors++;
//         //         }
//         //     }
//         //     if (factors == 2 ){
//         //         System.out.println(num + " is a Prime Number");
//         //     } else if (num == 1 || num <= 0) {
//         //         System.out.println(num + " is not a Prime number");
//         //     } else {
//         //         System.out.println(num + " is not a Prime Number");
//         //     }
//         // }
//         //  armstrong function callback
//         // for (int count = 1; count <= 1000; count++) {
//         //     armStrong(count);      
//         // }
//         // Scanner input = new Scanner(System.in);
//         System.out.println("Enter a numbers to find sum of n natural numbers");
//         // int num1 = input.nextInt();
//         // int num2 = input.nextInt();
//         // int num3 = input.nextInt(); 

//         // sum of n natural Numbers
//         // NSum(num1);

//         // Prime Numbers In Between 
//         // PrimeInBetween(num1, num2);
//         // Pythogorean
//         // if (Pythagorean(num1, num2, num3) == true){
//         //     System.out.println("Yes, It is Pythagorean");
//         // } else{
//         //     System.out.println("No, It is not Pythagorean");
//         // }
//         // Palindrome
//         // Palindrome(n);
//         // factorial(n);
//         // maximunInt(num1, num2, num3);
//         // minimumInt(num1, num2, num3);
//     }
//     // find arm strong number
//     // static void armStrong(int n) {
//     //     int num = n;
//     //     int temp = num;
//     //     if (temp == 0) {
//     //         System.out.println("No of digit in " + temp + " is 1");
//     //         return;
//     //     }
//     //     int count = 0;
//     //     while (num > 0) {
//     //         num /= 10;
//     //         count++;
//     //     }

//     //     int originalCount = count;
//     //     int temp1 = temp;
//     //     int armStrongNum = 0;
//     //     while (temp1 > 0) {
//     //         int lastdigit = temp1 % 10;
//     //         int mult = 1;
//     //         int currentPower = originalCount;
//     //         temp1 /= 10;
//     //         while (currentPower > 0) {
//     //             mult *= lastdigit;
//     //             currentPower--;
//     //         }
//     //         armStrongNum = armStrongNum + mult;
//     //     }
//     //     if (armStrongNum == temp) {
//     //         System.out.println(temp + " is a ArmStrong Number");
//     //     } else {
//     //         System.out.println(temp + " is not a ArmStrong Number");
//     //     }
//     // }
//     // find max Int 
//     // static void maximunInt(int num1, int num2, int num3){
//     //     if (num1 >= num2 && num1 >= num3 ){
//     //         System.out.println(num1 + " is the maximum number");
//     //     } else if(num2 >= num3 && num2 >= num1){
//     //         System.out.println(num2 + " is the maximum number");
//     //     } else {
//     //         System.out.println(num3 + " is the maximum number");
//     //     }
//     // }
//     // static void minimumInt(int num1, int num2, int num3){
//     //     if(num1 <= num2 && num1 <= num3){
//     //         System.out.println(num1 + " is the minimum number");
//     //     } else if(num2 <= num3 && num2 <= num1){
//     //         System.out.println(num2 + " is the minimum number");
//     //     } else{
//     //         System.out.println(num3 + " is the minimum number");
//     //     }
//     // }
//     // function for factorial
//     // static void factorial(int n){
//     //     long fact = 1;
//     //     if(n == 0){
//     //         System.out.println("Factorial of 0 is 1");
//     //     }
//     //     for(int count = 1; count <= n; count++ ){
//     //         fact *= count;
//     //         System.out.println(count); 
//     //     }
//     //     System.out.println("Factorial of " + n + " is " + fact);
//     // }
//     // palindrome number
//     // static void Palindrome(int n) {
//     //     int absValue = Math.abs(n);
//     //     int palindrome = 0;
//     //     while (absValue > 0) {
//     //         palindrome = (palindrome * 10) + (absValue % 10);
//     //         absValue = absValue / 10;
//     //     }
//     //     if (palindrome == Math.abs(n)) {
//     //         System.out.println(n + " is Palindrome Number");
//     //     } else {
//     //         System.out.println(n + " is not Palindrome");
//     //     }
//     // }
//     // Check pythagorean 
//     // static boolean Pythagorean( int num1, int num2, int num3){    
//     // return num1*num1+num2*num2 == num3*num3 || num1*num1+num3*num3 == num2*num2 || num3*num3+num2*num2 == num1*num1;
//     // }
//     // Prime numbers between two numbers
//     // static void PrimeInBetween(int num1, int num2) {
//     //     if(num1 <= 0 || num2 <= 0){
//     //         System.out.println("Entered Number Cannot be smaller or equal to Zero"); 
//     //     } else{
//     //         int a = 0;
//     //         int b = 0;
//     //         if(num1 > num2){
//     //             a = num1;
//     //             b = num2;
//     //         } else if (num2 > num1) {
//     //             a = num2;
//     //             b = num1;
//     //         } else {
//     //             System.out.println("Enter Valid Integers");
//     //         }
//     //         while (a >= b) {
//     //             int factors = 0;
//     //             int secCount = 1;
//     //             while (secCount <= a) {
//     //                 if (a % secCount == 0 ) {
//     //                     factors++;
//     //                 }
//     //                 secCount++;
//     //             }
//     //             if(factors == 2){
//     //                 System.out.println(a + " is a Prime Number");
//     //             }
//     //             a--;
//     //         }
//     //     }
//     // }
//     // sum of n natural numbers
//     static void NSum(int n) {
//         int sum = 0;
//         for (int i = 0; i <= n; i++) {
//             sum += i;
//         }
//         System.out.println("Total Sum is " + sum);
//     }

// }
