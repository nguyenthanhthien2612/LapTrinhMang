import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream data = null;
		String path = new String();
		System.out.println("Nhap Duong dan den File: ");
//		E:\CT221_LTM\BT1\src\data2.txt
		path = sc.nextLine();
		
		try {
			data = new FileInputStream(path);
			byte [] bytedata = new byte[100];
			int length = data.read(bytedata);
			String result = new String(bytedata,0,length);
		
			System.out.println(result);
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
