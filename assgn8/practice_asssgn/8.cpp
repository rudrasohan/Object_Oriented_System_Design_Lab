#include <iostream>
using namespace std;
class a
{
public:
	a()
	{
		cout <<"h";
	}
	void b()
	{
		cout <<"a";
	}
};

int main(int argc, char const *argv[])
{
	a t;
	t.b();
	return 0;
}