import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String str = null;
		float x = 0;	
		int n = 0;
		while(true) {
			try { 
				
				System.out.println("Nhap vao so thuc X: ");
				str = obj.nextLine();
				x = Float.parseFloat(str);
				
				System.out.println("Nhap so nguyen N: ");
				str = obj.nextLine();
				n = Integer.parseInt(str);
				break;
			}
			catch(Exception e) {
				System.out.println("Nhap sai kieu - Nhap lai");
				
				
			}
		}
		
		System.out.println(x+" luy thua "+n+" = "+Math.pow(x, n));
	}

}
