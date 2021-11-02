#include <iostream>
using namespace std;

enum KindofPolygon
    {
        POLY_PLAIN,
        POLY_RECT,
        POLY_TRIANG
    };
class Polygon
{
    public:
        string _name;
        float _width;
        float _height;
        KindofPolygon _type;

        Polygon(string theName, float theWidth, float theHeight)
        {
            _name = theName;
            _width = theWidth;
            _height = theHeight;
            _type = POLY_PLAIN;
            cout << "constructing Polygon object " << _name << endl;
        }
        ~Polygon()
        {
        }

        KindofPolygon getPolytype()
        {
            return _type;
        }

        void setPolytype(KindofPolygon value)
        {
            _type = value;
        }

        string getName() 
        { 
            return _name; 
        }

        virtual float calArea() 
        { 
        }

        void printWidthHeight()
        {
        cout<<"Width = "<< _width << " Height = " << _height << endl;
        }
    };

class Rectangle : public Polygon
{
    public:
        Rectangle(string theName, float theWidth, float theHeight) : Polygon(theName, theWidth, theHeight)
        {
            _type = POLY_RECT;
            cout << "constructing Rectangle object " << _name << endl;
        }

        float calArea()
        {
            return _width * _height;
        }

        void printArea(float area)
        {
            cout<< "The total area for " << _name << " is: " << area << endl;
        }
};

class Triangle : public Polygon
{
    public:
        Triangle(string theName, float theWidth, float theHeight) : Polygon(theName, theWidth, theHeight)
        {
            _type = POLY_TRIANG;
            cout << "constructing Triangle object " << _name << endl;
        }

        float calArea(){
            return 0.5 * _width * _height;
        }
        
        void printArea(float area)
        {
            cout<< "The total area for " << _name << " is: " << area << endl;
        }
};

int main(){
    Rectangle rect("Spongebob", 4, 5);
    Triangle tri("Patrick", 4, 5);

    float rectArea = rect.calArea();
    float triArea = tri.calArea();
    rect.printArea(rectArea);
    tri.printArea(triArea);
    
    cout << "Program exiting …. " << endl;
    return 0;
}