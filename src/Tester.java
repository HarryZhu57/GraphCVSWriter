public class Tester {
	public static void main(String[] args) {
		FunctionPlotter a = new FunctionPlotter();
		Salter sa = new Salter();
		Smoother sm = new Smoother();
		
		int bounds = 30000;
		int range = 7;
		
		a.outputGraph();
		sa.Salt(bounds);
		sm.Smooth(range);
	}
}
