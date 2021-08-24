import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream data = null;
		String path = new String();
		System.out.println("Nhap Duong dan den File: ");
		path = sc.nextLine();
		
		try {
			data = new FileInputStream(path);
			int ch;
			while((ch = data.read()) != -1) {
				System.out.println((char)ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(data != null) {
				try {
					data.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		}


	}
}
