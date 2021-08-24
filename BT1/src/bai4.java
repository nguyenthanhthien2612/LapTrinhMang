import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = new String();
		System.out.println("Nhap Duong dan den File: ");
//		E:\CT221_LTM\BT1\src\data3.txt
		path = sc.nextLine();
		
		FileInputStream  file = null;
		
		try {
			file = new FileInputStream(path);
	        Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
		} catch(Exception e) {
			System.out.print("Khong the doc file");
			
		} finally {
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
