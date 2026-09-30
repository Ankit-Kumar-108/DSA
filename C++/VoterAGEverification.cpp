#include<iostream>
using namespace std;

void AgeVerification(int n, string name){
  if (n>=18)
  {
  cout<<"Yes, "<<name<<" is eligible to vote and he is "<<n<<" years old"<<endl;
  }
  else
  {
  cout<<"No, "<<name<<" is not eligible to vote and he is "<<n<<" years old"<<endl;
  }
}

int main (){
    string name;
    int n ;
    cout<<"Enter Name of Voter\n";
    getline(cin, name);
    cout<<"Enter Age"<<endl;
    cin>>n;
    AgeVerification(n , name);
 return 0;
}