import java.io.*;
public class Mo2 {
	public static void main(String args[]) throws IOException {
		BufferedReader mo = new BufferedReader(new InputStreamReader(System.in));
	String m[][] = new String[3][3];
		System.out.println("=================================================");
		System.out.println("               Calculate Tax Salary              ");
		System.out.println("=================================================");
		System.out.print("ID : ");
			m[0][0] = mo.readLine();
		System.out.print("Name : ");
			m[0][1] = mo.readLine();
		System.out.print("Salary : ");
			m[0][2] = mo.readLine();
		int Salary = Integer.parseInt(m[0][2]);
			double Vat, Income, Tax;
			if(Salary >= 30000) {
				Vat = 0.15;
			}
			else if(Salary >= 20000) {
				Vat = 0.13;
			}
			else if(Salary >= 10000) {
				Vat = 0.10;
			}
			else if(Salary >= 5000) {
				Vat = 0.08;
			}
			else {
				Vat = 0.04;
			}
				Tax = Salary * Vat;
				Income = Salary - Tax;
	System.out.println("ID : " + m[0][0]);
	System.out.println("Name : " + m[0][1]);
	System.out.println("Tax : " + Tax);
	System.out.println("Salary : " + Income);
	System.out.println("=================================================");
	System.out.println("        Boonyada  Soongtiwong  5808311010        ");
	System.out.println("=================================================");
	}
}		