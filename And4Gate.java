public class And4Gate implements AndGate{
	GateAdapter gateadapter;
	@Override
	public int and4g(int input1, int input2, int input3, int input4){
		gateadapter = new GateAdapter();
		return gateadapter.and4g(input1, input2, input3, input4);
	}
}