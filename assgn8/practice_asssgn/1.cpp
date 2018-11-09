#include <iostream>
using namespace std;

class b
{
	public:
		int p,q;
		b(int w)
		{
			p = w + 7;
			q = w - 7;
		}

		void g(int w)
		{
			p = w + 7;
			q = w - 7;
		}
		friend ostream& operator<<(ostream& os, b& x) 
		{
        	return os <<x.p<<","<<x.q;
    	}	
};

int main(int argc, char const *argv[])
{
	b x(3);
	//cout <<x.p<<","<<x.q<<"\n";
	cout <<x<<endl;
	x.g(9);
	cout <<x<<endl;
	return 0;
}