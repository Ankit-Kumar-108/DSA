#include<iostream>
using namespace std;

int main(){
    double x,y;
    cout<<"Enter C.P\n";
    cin>> x;
    cout<<"Enter S.P\n";
    cin>> y;
    if (y>x)
    {
        cout<<"A profit of:- "<<y-x<<endl;

    }
    if (x>y)
    {
        cout<<"A loss of:- "<< x-y<<endl;
    }
    if(x==y)
    {
        cout<<"Neither profit nor loss\n";
    }
    

    
    




    return 0;
}