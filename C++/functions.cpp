#include<iostream>
using namespace std;
// void greet(){
//     cout<<"This is a function"<<endl;
// }
string welcome(string name, string age ){
   string show = "Welcome " + name +" you are " +age +" years old";
   return show;

}

int main(){
    // greet();
string A1 = welcome("Ankit" , "20");
cout<<A1;
    return 0;   
}