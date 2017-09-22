#include <stdio.h>

using namespace std;

class and4gate{
public:
	virtual int output(int input1, int input2)=0;
	virtual ~and4gate(){}
};

class and2gate:public and4gate{
public:
	and2gate(){}
	int output(){
		if(a==1 && b==1){
			return 1;
		}
		else{
			return 0;
		}
	}
};

class andproxy:public and4gate{
	andproxy* sub;
public:
	andproxy() : sub(NULL){}
	int output(int a, int b){
		if(sub==NULL){
			sub=new andproxy();
		}
		sub->output();
	}
	~andproxy(){
		delete sub;
	}
};

int main(){
	int a, b, c, d;

}

/*#include<iostream>
#include<string>
 
using namespace std;
 
class IWrestler
{
public:
	virtual void ComeOnFightMe(void) = 0;
	virtual void Insult(string expletives) = 0;
	virtual ~IWrestler(){}
};
 
class BigShow : public IWrestler
{
public:
	BigShow()
	{
		//Some really massive amount of resources needed
		//to bring it to life.
	}
 
	void ComeOnFightMe(void)
	{
		cout << "\nMassive ignore.";
	}
 
	void Insult(string expletives)
	{
		cout << "\nYou just got CHOKESLAMMED.\n\n";
	}
};
 
class BigShowProxy : public IWrestler
{
	BigShow* sub;
 
public:
	BigShowProxy() :sub(NULL){}
 
	void ComeOnFightMe(void)
	{
		cout << "\nJust run away please !!! (psst This is proxy speaking, not the BigShow)\n";
	}
 
	void Insult(string expletives)
	{
		if (sub == NULL)
		{
			sub = new BigShow();
		}
		sub->Insult(expletives);
	}
 
	~BigShowProxy()
	{
		delete sub;
	}
};
 
int main()
{
	IWrestler* bigShow = new BigShowProxy();
	bigShow->ComeOnFightMe();
	cout << "\n";
	bigShow->Insult("Scared eh BigShow?");
 
	delete bigShow;
	return 1;
}*/