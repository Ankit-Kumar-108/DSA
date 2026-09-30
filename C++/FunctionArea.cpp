#include<iostream>
using namespace std;

void greet(){
    cout<<"Area and Circumference Calculation\n";
}

double AreaOfCircle (int r){
    // cin>>r;
   double A = 3.14 *r*r;
   return A;
}
double Circumference(int r){
    // cin>>r;
    double B = 2*3.14*r;
    return B;
}

int main (){
greet();
int r;
int op;
cout<<"1.Find Area of Circle\n2.Find Circumference of circle\n3.Both\n";
cin>>op;
cout<<"enter radius\n";
cin>>r;
if (op == 1)
{
    cout<<AreaOfCircle(r)<<endl;
}

 if (op == 2)
 {
    cout<<Circumference(r)<<endl;
 }

  if (op == 3)
  {
     cout<<AreaOfCircle(r)<<endl;

     cout<<Circumference(r)<<endl;
     }

     else
     {
     cout<<"enter valid character\n";
     }
     



    return 0;
}