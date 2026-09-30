#include<iostream>
using namespace std;

int main(){
   int a;
   cout <<"enter a number\n";
   cin>>a;
   int b =1;
  int i = 1;
 while (i <= a)
 {
    b *= i;
   // cout<<i<< "";
    i++;
   // cout<<i++;
 }
 
 cout<<b<<endl;


    return 0;
}