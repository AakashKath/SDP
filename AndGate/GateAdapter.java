public class GateAdapter implements AndGate{
	AdvancedAndGate advancedandgate;
	public GateAdapter(String gatetype){
		if(gatetype.equalsIgnoreCase("and")){
			advancedandgate = new And2Gate();
		}
		else if(gatetype.equalsIgnoreCase("nand")){
			advancedandgate = new Nand2Gate();
		}
	}
	@Override
	public int and4g(String gatetype, int input1, int input2, int input3, int input4){
		if(gatetype.equalsIgnoreCase("and")){
			int x1=advancedandgate.and2g(input1, input2);
			int x2=advancedandgate.and2g(input3, input4);
			return advancedandgate.and2g(x1, x2);
		}
		else if(gatetype.equalsIgnoreCase("nand")){
			int x1=advancedandgate.nand2g(advancedandgate.nand2g(input1, input2), advancedandgate.nand2g(input1, input2));
			int x2=advancedandgate.nand2g(advancedandgate.nand2g(input3, input4), advancedandgate.nand2g(input3, input4));
			return advancedandgate.nand2g(x1, x2);
		}
		return -1;
	}
}