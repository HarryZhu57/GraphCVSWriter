import java.io.FileWriter;
import java.io.BufferedWriter;

public class FunctionPlotter {
	FileWriter fw;
	BufferedWriter bw;
	int x,y;
	
	public FunctionPlotter() {
		try {
			fw = new FileWriter("Function.csv");
		} catch(Exception e) {
			System.out.println("Error Occured: " + e.toString());
		}
	}
	
	public void outputGraph(){
        bw = new BufferedWriter(fw);
        try{
            try{
                bw.write("x,y\n");
                for(int i=1; i<=1000;i++){
                    x = i;
                    y = x*x;
                    bw.write(x + "," + y + "\n");
                }
            } finally {
                bw.close();
            }
        } catch (Exception e) {
            System.out.println("Error in writing or closing file: " + e.toString());
        }
    }
}
