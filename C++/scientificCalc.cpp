#include<iostream>
#include<cmath>
using namespace std;

int main(){

    double a, b;
    int op;
    cout<<"Scientific Calc Loading....."<<endl;

    cout<<"Choose the Operation. "<<endl;
    cout<<"1. ADD"<<endl;
    cout<<"2. SUBTRACT"<<endl;
    cout<<"3. MULTIPLY"<<endl;
    cout<<"4. DIVIDE"<<endl;
    cout<<"5. REMAINDER"<<endl;
    cout<<"6. SQUARE"<<endl;
    cout<<"7. ROOT"<<endl;
    cout<<"8. SIN FUNCTION"<<endl;
    cout<<"9. COS FUNCTION"<<endl;
    cout<<"10.TAN FUNCTION"<<endl;
    cout<<"11.LOG FUNCTION"<<endl;
    cout<<"12.{POWER}"<<endl;
    cout<<"13.FACTORIAL"<<endl;
    cout<<"14.EXIT..."<<endl;

    cin>>op;

    switch (op)
    {
        case 1:
            cout<<"Enter A and B number\n";
            cin>>a>>b;
            cout<<"RESULT:- "<<a+b<<endl;
            break;

        case 2:
            cout<<"Enter A and B number\n";
            cin>>a>>b;
            cout<<"RESULT:- "<<a-b<<endl;
            break;

        case 3:
            cout<<"Enter A and B number\n";
            cin>>a>>b;
            cout<<"RESULT:- "<<a*b<<endl;
            break;

        case 4:
            cout<<"Enter A and B number\n";
            cin>>a>>b;
            if(b != 0)
                cout<<"RESULT:- "<<a/b<<endl;
            else
                cout<<"Division by zero not allowed!"<<endl;
            break;

        case 5:
            cout<<"Enter A and B number\n";
            cin>>a>>b;
            if(b != 0)
                cout<<"RESULT:- "<<fmod(a, b)<<endl;
            else
                cout<<"Division by zero not allowed!"<<endl;
            break;

        case 6:
            cout<<"Enter A number\n";
            cin>>a;
            cout<<"RESULT:- "<<pow(a,2)<<endl;
            break;

        case 7:
            cout<<"Enter A number\n";
            cin>>a;
            if(a >= 0)
                cout<<"RESULT:- "<<sqrt(a)<<endl;
            else
                cout<<"Square root of negative number not defined!"<<endl;
            break;

        case 8:
            cout<<"Enter A number\n";
            cin>>a;
            cout<<"RESULT:- "<<sin(a)<<endl;
            break;

        case 9:
            cout<<"Enter A number\n";
            cin>>a;
            cout<<"RESULT:- "<<cos(a)<<endl;
            break;

        case 10:
            cout<<"Enter A number\n";
            cin>>a;
            cout<<"RESULT:- "<<tan(a)<<endl;
            break;

        case 11:
            cout<<"Enter A number\n";
            cin>>a;
            if (a>0)
                cout<<"RESULT:- "<<log(a)<<endl;
            else
                cout<<"Not Defined!\n";
            break;

        case 12:
            cout<<"Enter A and B number\n";
            cin>>a>>b;
            cout<<"RESULT:- "<<pow(a,b)<<endl;
            break;

        case 13: {
            cout<<"Enter a non-negative integer\n";
            int n;
            cin>>n;
            if(n < 0)
                cout<<"Factorial not defined for negative numbers!"<<endl;
            else {
                unsigned long long fact = 1;
                for(int i=1; i<=n; ++i)
                    fact *= i;
                cout<<"RESULT:- "<<fact<<endl;
            }
            break;
        }

        case 14:
            cout<<"BYE.....\n";
            break;

        default:
            cout<<"Enter Valid Number..\n";
            break;
    }

     // Pause the console to prevent it from closing immediately
    cout << "\nPress any key to exit...";
    cin.ignore(); // Clear the input buffer
    cin.get();    // Wait for user input

    return 0;
}