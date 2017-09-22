public class And4Gate implements AndGate{
	GateAdapter gateadapter;
	@Override
	public int and4g(String gatetype, int input1, int input2, int input3, int input4){
		if(gatetype.equalsIgnoreCase("and") || gatetype.equalsIgnoreCase("nand")){
			gateadapter = new GateAdapter(gatetype);
			return gateadapter.and4g(gatetype, input1, input2, input3, input4);
		}
		else{
			System.out.println("Invalid input, format not supported");
			return -1;
		}
	}
}