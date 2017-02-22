#include <vector>
#include <iostream>
#include <fstream>
using namespace std;
class random
{
	public:
		random(){
			fstream f;
			f.open("tes.txt",ios::out);
			f<<"not lol";
			f.close();
		}
		~random(){
			fstream f;
			f.open("tes.txt",ios::out);
			f<<"lol";
			f.close();
		}
};
int main()
{
	random r;
	cout<<"press";
	int a;cin>>a;
	return 0;
}
