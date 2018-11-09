#include <iostream>
using namespace std;

class a
{
public:
	void g()
	{
		cout <<"anil";
	}
};

class b: public a
{
public:
	void g()
	{
		cout<<"hari";
	}
};

int main(int argc, char const *argv[])
{
	a *x;
	b y;
	x = &y;
	(*x).g();
	return 0;
}