#include <iostream>
using namespace std;
class a
{
public:
	void g(int a)
	{
		cout <<a+2;
	}

	void g(float a)
	{
		cout <<a+2;
	}
	void g(double a)
	{
		cout <<a+4;
	}
};

int main()
{
	a x;
	int p = 5;
	float q = 5;
	double r = 5;
	x.g(p);
}
