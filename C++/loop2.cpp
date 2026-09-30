#include<iostream>
using namespace std;

int main(){
int x=10;
int value;
do{
	cout<<"enter number untill it's equal or greater than x"<<endl;
	cin>>value;
}while (value<x||value==x);

cout<<"you have entered value"<<value<<endl;
 return 0;
}