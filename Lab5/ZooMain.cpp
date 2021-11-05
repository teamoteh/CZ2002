#include <iostream>
#include <string>
#include "childAnimal.cpp"
#include "Animal.cpp"

int main()
{
    Mammal **zoo = new Mammal*[3];
    int option = 0;

    do{
        cout << "Select animal to send to the zoo:" << endl;
        cout << "(1) Dog" << endl;
        cout << "(2) Cat" << endl;
        cout << "(3) Lion" << endl;
        cout << "(4) Move all animals" << endl;
        cout <<"(5) Quit"<<endl;
        cin >> option;
        switch (option)
        {
            case 1:
                zoo[0] = new Dog("Preston", Blue, "Andy");
                zoo[0]->move();
                zoo[0]->speak();
                zoo[0]->eat();
                break;
            case 2:
                zoo[1] = new Cat("Lance", Green, "Koko");
                zoo[1]->move();
                zoo[1]->speak();
                zoo[1]->eat();
                break;
            case 3:
                zoo[2] = new Lion("Leo", Brown);
                zoo[2]->move();
                zoo[2]->speak();
                zoo[2]->eat();
                break;
            case 4:
                for(int i = 0; i < 3; i++){
                    zoo[i]->move();
                    zoo[i]->speak();
                    zoo[i]->eat();
                }
                break;
        }
    }while(option != 5);
    for(int i=0; i<3; i++)
        delete zoo[i];
    delete [] zoo;

    cout << "Program is exiting..." <<endl;

    return 0;
    
}


