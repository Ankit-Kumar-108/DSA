#include<iostream>
#include<chrono>
#include<thread>



using namespace std;

int main()
{
//1.Sum of Even Numbers: Write a program that asks for an integer N and calculates the sum of all even numbers from 1 to N.
 int n;
 int sum;
 cin >>n;
for ( int i = 0; i <=n; i++)
   if (i%2==0) {
       sum += i;
       cout<<"The Even Numbers are "<<i<<endl;
      
      
   }
{
   cout<<"The Sum is "<<sum<<endl;
}



//2. Factorial Calculator: Create a program that computes the factorial of a non-negative integer entered by the user. The factorial of a number n (denoted as n!) is the product of all positive integers up to n. For example, 5=5
// times4
// times3
// times2
// times1=120.
 long long factorial=1;
for (int i = 1; i <=n; i++)
  factorial *= i;
{
   cout<<"The Factorial is "<<factorial<<endl;
}

//3. Multiplication Table: Write a program that takes an integer from the user and prints its multiplication table from 1 to 10.
for ( int i = 1; i <=10; i++)
  
{
cout<<n<<"x"<<i<<"="<<n*i<<endl;
}


//4. Power Calculator: Write a program that takes two integers, a base and an exponent, and calculates the base raised to the power of the exponent without using the pow() function.
int exp;
cout<<"Enter The Exponent\n ";
cin>>exp;
int power= 1;//because of garbage
for (int i = 1; i <=exp; i++)
power *= n;

{
    cout<<"The Power of The Integer "<<power<<endl;
}


//5.Countdown: Ask the user for a positive integer and then print a countdown from that number to 1, followed by "Blastoff!".
for (int i = n; i>0; i--)
{
   this_thread::sleep_for(chrono::seconds(1));
   cout<<i<<endl;
}
cout<<"END"<<endl;
// ## Pattern Printing
// Solid Square: Write a program that asks for a size N and prints an N
// timesN square of asterisks (*).
// Example for N=4:
for (int i = 0; i < n; i++)
{
   for (int j = 0; j < n; j++)
   {
      cout<<"*";
   }
   cout<<endl;
}

// ****
// ****
// ****
// ****
// Right-Angled Triangle: Ask the user for a height H and print a right-angled triangle of asterisks of that height.
// Example for H=4:
for (int i = 0; i <= n; i++)
{
   for (int j = 0; j < i; j++)
   {
    cout<<"*";
   }
  cout<<endl; 
}


// *
// **
// ***
// ****
// Number Pyramid: Ask for a height H and print a pyramid of numbers.
// Example for H=4:
for (int i = 0; i <= n; ++i)
{
   for (int j = 1; j <= i; j++)
    
   {
    cout<<i;
   }
  cout<<endl; 
} 

// 1
// 22
// 333
// 4444
// ## Input and Data Handling
// Simple Input Validation: Write a program that repeatedly asks the user to enter a number between 1 and 100 until they enter a valid number.

// Digit Counter: Create a program that counts the number of digits in an integer provided by the user. For example, the number 25491 has 5 digits.








    return 0;
}
