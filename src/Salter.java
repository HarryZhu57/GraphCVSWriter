import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Salter {
	
	public Salter() {
		
	}
	
	public void Salt(int d) {
		
		try {
			
			File a = new File("Function.csv");
			Scanner sc = new Scanner(a);
			FileWriter fw = new FileWriter("Salty.csv");
			BufferedWriter bw = new BufferedWriter(fw);;
			Random rand = new Random();
			try {
				while(sc.hasNextLine()) {
					String comma = sc.nextLine();
					int ny = 0;
					
					for(int i = 0;i <= comma.length();) {
						
						int com = comma.indexOf(",");
						int y = Integer.valueOf(comma.substring(com+1));
						int x = Integer.valueOf(comma.substring(0,com));
						boolean pone = rand.nextBoolean();
						int ran = rand.nextInt(d);
				
						if(pone == true) {
							ny = y + ran;
						}
						else {
							ny = y - ran;
						}
	
						bw.write(x + "," + ny +  "\n");
						
						break;
					}
				}
			}
				finally {
					bw.close();
					sc.close();
				}
		}
		
		catch(Exception e) {
			System.out.println("Error:" + e.toString());
		}
	}
}
