//Concrete class And2Gate implementing AdvancedAndGate interface
public class And2Gate implements AdvancedAndGate{
	@Override
	public int and2g(int input1, int input2){//2 input and gate circuit implementaion
		if(input1==1 && input2==1){
			return 1;
		}
		else{
			return 0;
		}
	}
	@Override
	public int nand2g(int input1, int input2){
		return -1;
	}
}