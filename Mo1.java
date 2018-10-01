import java.io.*;
public class Mo1 {
	public static void main(String args[]) throws IOException {
		BufferedReader mo = new BufferedReader(new InputStreamReader(System.in));
	String m[][] = new String[3][3];
		System.out.println("=================================================");
		System.out.println("                  Calculate Grade                ");
		System.out.println("=================================================");
		System.out.print("Name : ");
			m[0][0] = mo.readLine();
		System.out.print("Subject : ");
			m[0][1] = mo.readLine();
		System.out.print("Total Score : ");
			m[0][2] = mo.readLine();
		int Score = Integer.parseInt(m[0][2]);
			String Grade;
			if(Score >= 80){
				Grade = "A";
			} 
			else if(Score >= 75) {
				Grade = "B+";
			} 
			else if(Score >= 70) {
				Grade = "B";
			}
			else if(Score >= 65) {
				Grade = "C+";
			}
			else if(Score >= 60) {
				Grade = "C";
			}
			else if(Score >= 55) {
				Grade = "D+";
			}
			else if(Score >= 50) {
				Grade = "D";
			}
			else {
				Grade = "F";
			}
	System.out.println("Name : " + m[0][0]);
	System.out.println("Subject : " + m[0][1]);
	System.out.println("Grade : " + Grade);
	System.out.println("=================================================");
	System.out.println("        Boonyada  Soongtiwong  5808311010        ");
	System.out.println("=================================================");
	}
}
		