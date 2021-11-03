#include <iostream>
#include <string>
using namespace std;
enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};
class Animal
{
public:
    Animal() : _name("unknown")
    {
        cout << "constructing Animal object " << _name << endl;
    }
    Animal(string n, COLOR c)
    {
        _name = n;
        _color = c;
        cout << "constructing Animal object " << _name << endl;
        cout << "constructing Animal colour " << _color << endl;
    }
    ~Animal()
    {
        cout << "destructing Animal object " << _name << endl;
    }
    virtual void speak() const
    {
        cout << "Animal speaks " << endl;
    }
    virtual void move() = 0;

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
    public:
    
    void eat()
    {
        cout << "Mammal eat" << endl;
    }

    Mammal(string n, COLOR c) : Animal(n, c)
    {

    }   
    ~Mammal()
    {

    }
};

class Dog : public Mammal
{
    public:
        Dog(string n, COLOR c, string o) : Mammal(n, c)
        {
            _owner = o;
        }
        ~Dog()
        {

        }

        void speak()
        {
            cout << "Woof Woof!" << endl;
        }

    private:
        string _owner;
};
int main()
{
    Animal a("Shark", Blue);
    a.speak();

    Mammal m("Bear", Brown);
    m.speak();

    Dog d("Schnauzer", Black, "Bernard");
    d.speak();

    cout << "Program exiting …. " << endl;
    return 0;

}
