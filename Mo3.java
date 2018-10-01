import java.io.*;
public class Mo3 {
	public static void main(String args[]) throws IOException {
		BufferedReader mo = new BufferedReader(new InputStreamReader(System.in));
	String m[][] = new String[3][3];
		System.out.println("=================================================");
		System.out.println("               Calculate Commission              ");
		System.out.println("=================================================");
		System.out.print("ID : ");
			m[0][0] = mo.readLine();
		System.out.print("Name : ");
			m[0][1] = mo.readLine();
		System.out.print("Sales : ");
			m[0][2] = mo.readLine();
		int Sales = Integer.parseInt(m[0][2]);
			double Com, Salary, Commission;
			if(Sales >= 40000) {
				Com = 0.15;
			}
			else if(Sales >= 30000) {
				Com = 0.13;
			}
			else if(Sales >= 20000) {
				Com = 0.10;
			}
			else if(Sales >= 10000) {
				Com = 0.08;
			}
			else { 	
				Com = 0;
			}
				Commission = Sales * Com;
				Salary = Sales + Commission;
	System.out.println("ID : " + m[0][0]);
	System.out.println("Name : " + m[0][1]);
	System.out.println("Commission : " + Commission);
	System.out.println("Salary : " + Salary);
	System.out.println("=================================================");
	System.out.println("        Boonyada  Soongtiwong  5808311010        ");
	System.out.println("=================================================");
	}
}		