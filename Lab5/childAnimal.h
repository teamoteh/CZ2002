using namespace std;

#include "Animal.h"
#include <iostream>
#include <string>
#pragma once

class Dog : public Mammal {
    private:
        string _owner;

    public:
        Dog();
        Dog(string n, COLOR c, string o);

        ~Dog();

        void speak() const;
        void move();
        void eat();
};

class Cat : public Mammal {
    private:
        string _owner;

    public:
        Cat();
        Cat(string n, COLOR c, string o);

        ~Cat();

        void speak() const;
        void move();
        void eat();
};

class Lion : public Mammal {
    private:
        string _owner;

    public:
        Lion();
        Lion(string n, COLOR c);

        ~Lion();

        void speak() const;
        void move();
        void eat();
};