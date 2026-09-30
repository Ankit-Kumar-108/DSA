#include<iostream>
using namespace std;

void OddFunction(int a,int b){
  cout<<"Finding Odd numbers between First And Second numbers\n";
  for ( int i = a ; i <=b; i++)
  {
   if (i % 2 != 0)
   {
    cout<< i <<endl;
   }
 }
}

int main()
{
    int a,b;
    cout<<"Enter First Number"<<endl;
    cin>>a;
    cout<<"Enter Second Number"<<endl;
    cin>>b;
    OddFunction(a, b);
}