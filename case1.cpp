#include <iostream>

using namespace std;

class and2gate{
public:

};

class Adapter : public {

};

int and2gate(int input1, int input2){
	if(input1==1 && input2==1){
		return 1;
	}
	else{
		return 0;
	}
}

int and4gate(int i1, int i2, int i3, int i4){
	return and2gate(and2gate(i1, i2), and2gate(i3, i4));
}

int main(){
	int i1, i2, i3, i4;
	cin >> i1 >> i2  >> i3  >> i4;
	cout << and4gate(i1, i2, i3, i4) << endl;
}