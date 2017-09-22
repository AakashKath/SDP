#include <iostream>

using namespace std;

class NAND_2 
{
	private:
		int input_a;
		int input_b;

	public:
		NAND_2(int a, int b)
		{
			input_a=a;
			input_b=b;
		}

	 	int value() 
		{ 
			return !(input_a&&input_b);
		}
};

class AND_2 
{
	private:
		int input_a;
		int input_b;

	public: 
		AND_2(int a, int b)
		{
			input_a=a;
			input_b=b;
		}

		int value() 
		{ 
			return (input_a&&input_b);
		}
};


// class Get 
// {
// 	public: 
// 		NAND_2 get_NAND_2(bool a, bool b)
// 		{
// 			NAND_2 a1(a,b);
// 			return  a1;
// 		}

// 		AND_2 get_AND_2(bool a, bool b)
// 		{ 
// 			AND_2 a1(a,b);
// 			return  a1;
// 		}
// };

// class AdapterImpl //implements Adapter
// {
// 	//Get get;
// 	public:
// 		int NAND_4(int a, int b, int c, int d)
// 		{
// 			AdapterImpl adap; 
// 			NAND_2 n1(1,adap.AND_4(a,b,c,d));/*= get.get_NAND_2*/
// 			std::cout<<"printing from adap class:"<<n1.value()<<"\n";

// 			return n1.value();
// 		}
	
// 		int AND_4(int a, int b, int c, int d) 
// 		{ 
// 			AND_2 a1(a,b);
// 			AND_2 a2(c,d);
// 			std::cout<<"from AND_4 "<<a1.value(),a2.value()<<"\n";
// 			AND_2 a3(a1.value(),a2.value());

// 			return a3.value();
// 		}
 
// };

class NAND_4
{
	public:
		int value;
		NAND_4(int a, int b, int c, int d)
		{
			AND_4 a1(a,b,c,d); 
			NAND_2 n1(1,a1);/*= get.get_NAND_2*/
			std::cout<<"printing from adap class:"<<n1.value()<<"\n";

			value=n1.value();
		}

};

class AND_4
{
	public:
		int value;
		AND_4(int a, int b, int c, int d)
		{
			AND_2 a1(a,b);
			AND_2 a2(c,d);
			std::cout<<"from AND_4 "<<a1.value(),a2.value()<<"\n";
			AND_2 a3(a1.value(),a2.value());

			value = a3.value();
		}

};



int main()
{
	int a,b,c,d;
	int choice;
	
	while(1)
	{
		std::cout<<"Enter a choice:\n";
		std::cout<<"1) 2 input AND\t2) 4 input AND\t3) 2 input NAND\t4) 4 input NAND\t0) Exit\n";
		std::cin>>choice;

		AdapterImpl adap;

		if(choice==1)
		{
			std::cout<<"Enter two boolean values:\n";
			std::cin>>a;
			std::cin>>b;
			AND_2 a1(a,b);
			std::cout<<"The AND of given two values is "<<a1.value()<<"\n";
		}
		else if(choice==2)
		{
			std::cout<<"Enter four boolean values:\n";
			std::cin>>a;
			std::cin>>b;
			std::cin>>c;
			std::cin>>d;
			int a1 = adap.AND_4(a,b,c,d);
			std::cout<<"The AND of given four values is "<<a1<<"\n";
		}
		else if(choice==3)
		{
			std::cout<<"Enter two boolean values:\n";
			std::cin>>a;
			std::cin>>b;
			NAND_2 a1(a,b);
			std::cout<<"The NAND of given two values is "<<a1.value()<<"\n";
		}
		else if(choice==4)
		{
			std::cout<<"Enter four boolean values:\n";
			std::cin>>a;
			std::cin>>b;
			std::cin>>c;
			std::cin>>d;
			int a1 = adap.NAND_4(a,b,c,d);
			std::cout<<"The NAND of given four values is "<<a1<<"\n";
		}
		else if(choice==0)
		{
			exit(0);
		}
	
	}
	
}
