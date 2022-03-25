import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Smoother {
	public Smoother() {
		
	}
	
	public void Smooth(int r) {
		
		try {
			
			File a = new File("Salty.csv");
			Scanner sc = new Scanner(a);
			Scanner sct = new Scanner(a);
			FileWriter fw = new FileWriter("Smooth.csv");
			BufferedWriter bw = new BufferedWriter(fw);;
			ArrayList<Integer> yVal = new ArrayList<Integer>();
			try {
				while(sc.hasNextLine()) {
					String comma = sc.nextLine();
					
					for(int i = 0;i <= comma.length();) {
						
						int y = Integer.valueOf(comma.substring(comma.indexOf(",")+1));
						
						yVal.add(y);
						
						break;
					}
				}
				
				int yindex = 0;
				
				while(sct.hasNextLine()) {
					String comma = sct.nextLine();
					double ny;
					int f, b;
					ny = 0;
					f = 0;
					b = 0;
					
					for(int i = 0;i <= comma.length();) {
						
						int com = comma.indexOf(",");
						int x = Integer.valueOf(comma.substring(0,com));

						if(yindex - r < 0) {
							for(int front = 0; front <= yindex+r; front++) {
								ny += yVal.get(front);
								f++;
							}
							ny = ny/f;
						}
						else if (yindex + r >= 1000){
							for(int back = yindex-r; back < 1000;back++ ) {
								ny += yVal.get(back);
								b++;
							}
							ny = ny/b;
						}
						else {
							for(int mid = yindex-r; mid <= yindex+r;mid++) {
								ny += yVal.get(mid);
							}
							ny = ny/((r*2)+1);
						}
						
						bw.write(x + "," + ny + "\n");
						
						break;
						}
					yindex++;
					}
				}
			
				finally {
					bw.close();
					sc.close();
					sct.close();
				}
		}
		
		catch(Exception e) {
			System.out.println("Error:" + e.toString());
		}
	}
}
