#include <iostream>
using namespace std;

class anil
{
	public:
		int x;
		void g(anil m)
		{
			cout <<x*100+m.x<<endl;
		}
		friend ostream& operator<<(ostream& os, anil& k) 
		{
        	return os << k.x;
    	}	
};

int main(int argc, char const *argv[])
{
	anil u,v;
	u.x = 5;
	v.x = 2;
	cout<<u<<endl;
	cout<<v<<endl;
	u.g(v);
	v.g(u);cout<<u<<endl;
	return 0;
}