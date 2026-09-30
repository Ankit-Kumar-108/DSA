#include<iostream>
using namespace std;

void EvenFunction(int a , int b){
    cout<<"Finding Even Numbers between First And Second Number\n";
    for (int i = a; i <=b; i++)
    {
    if (i%2==0)
    {
      cout<<i<<endl;
    }
  }
}
int main (){
    int a,b;
    cout<<"Enter First Number"<<endl;
    cin>>a;
    cout<<"Enter Second Number"<<endl;
    cin>>b;
    EvenFunction(a,b);
    return 0;
}