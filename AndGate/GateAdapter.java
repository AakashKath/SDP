public class GateAdapter implements AndGate{
	AdvancedAndGate advancedandgate;
	public GateAdapter(){
		advancedandgate = new And2Gate();
	}
	@Override
	public int and4g(int input1, int input2, int input3, int input4){
		return advancedandgate.and2g(advancedandgate.and2g(input1, input2), advancedandgate.and2g(input3, input4));
	}
}