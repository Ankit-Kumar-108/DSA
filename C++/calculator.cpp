#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    float a;
    float b;
    char selection;

    cout << "simple calculator" << endl;
    cout << "select the operation you want 1:- ADD  ,2:- Substract, 3:- Multiply, 4:- Division , 5:- Remainder " << endl;
    cin >> selection;
    cout << "first number" << endl;
    cin >> a;
    cout << "second number" << endl;
    cin >> b;

    switch (selection)
    {
        case '2':
            cout << "result:- " << a - b;
            break;

        case '1':
            cout << "result:- " << a + b;
            break;

        case '3':
            cout << "result:- " << a * b;
            break;

        case '4':
            cout << "result:- " << a / b;
            break;

        case '5':
            cout << "result:- " << fmod(a, b);
            break;
    }

    // Pause the console to prevent it from closing immediately
    cout << "\nPress any key to exit...";
    cin.ignore(); // Clear the input buffer
    cin.get();    // Wait for user input

    return 0;
}