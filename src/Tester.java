public class Tester {
	public static void main(String[] args) {
		FunctionPlotter a = new FunctionPlotter();
		Salter sa = new Salter();
		Smoother sm = new Smoother();
		
		int bounds = 0;
		int range = 2;
		
		a.outputGraph();
		sa.Salt(bounds);
		sm.Smooth(range);
	}
}
