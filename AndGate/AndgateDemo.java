//Main Class
import java.util.Scanner;

public class AndgateDemo{
	public static void main(String[] args){
		And4Gate and4gate = new And4Gate();
		Scanner sc = new Scanner(System.in);
		int input1, input2, input3, input4;
		String gatetype;
		gatetype=sc.next();					//NAND or AND(which one do you want to use?)
		input1=sc.nextInt();				//Input values
		input2=sc.nextInt();
		input3=sc.nextInt();
		input4=sc.nextInt();
		System.out.println(and4gate.and4g(gatetype, input1, input2, input3, input4));
	}
}