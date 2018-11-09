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
	void g(int w)
	{
		cout<<10*w;
	}
};

int main(int argc, char const *argv[])
{
	b y;
	y.g(2);
	a x;
	x.g();
	return 0;
}