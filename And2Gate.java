public class And2Gate implements AdvancedAndGate{
	@Override
	public int and2g(int input1, int input2){
		if(input1==1 && input2==1){
			return 1;
		}
		else{
			return 0;
		}
	}
}