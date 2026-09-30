#include<iostream>
using namespace std;

int main()
{
int a , b , c ;

cout<<"value before swapping\n";

cout<<"Enter A variable"<<endl;// values of aand b are assigned
cin>>a;

cout<<"Enter B variable"<<endl;
cin>>b;


cout<<"value after swapping\n";

c = a;
a=b;
b = c;// here values are inter swapped
cout<<"value of A\n"; 
cout<<a<<endl;

cout<<"value of B\n";
cout<<c<<endl;
cout<<b<<endl;

return 0;
}