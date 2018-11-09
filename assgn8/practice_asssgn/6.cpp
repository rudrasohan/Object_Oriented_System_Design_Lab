#include <iostream>

class a{};
class b{};
class c: public a, public b
{};
int main(int argc, char const *argv[])
{
	c x;
	return 0;
}