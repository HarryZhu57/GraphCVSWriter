public class Tester {
	public static void main(String[] args) {
		FunctionPlotter a = new FunctionPlotter();
		Salter s = new Salter();
		
		int bounds = 30000;
		
		a.outputGraph();
		s.Salt(bounds);
	}
}
