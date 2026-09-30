#include <iostream>
using namespace std;
int main() 
{   
    // datatypes
    int age = 25;
    float height = 5.9;
    char grade = 'A';
    string name = "Ankit";
    cout << "Name "<< name <<endl;
    cout << "Age "<< age <<endl;
    cout << "Height "<< height <<endl;
    cout << "Grade "<< grade <<endl;
    // USER INPUT 
    string  DOB;
    cout << "your date of birth"<<endl;
    cin>>DOB;
    cout<< "date of birth is "<<DOB<<endl;
    // conditional 
    int number;
    cout<<"enter a number "<<endl;
    cin>>number;
    if (number%2==0)
    {
        cout<<"The Number is EVEN"<<endl;
    }
    else
    {
        cout<<"The Number is ODD"<<endl;
    }
    return 0;
}
