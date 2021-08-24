import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String url_read, url_write = new String();
		System.out.println("Nhap duong dan file nhi phan can read: ");
		url_read = sc.nextLine();
//		E:\CT221_LTM\BT1\src\input.txt
		System.out.println("Nhap duong dan file nhi phan write: ");
		url_write = sc.nextLine();
//		E:\CT221_LTM\BT1\src\output.txt
		InputStream input = null;
		OutputStream output = null;
		
		try {
			input = new FileInputStream(url_read);
			output = new FileOutputStream(url_write);
			
			byte[] bytedata = new byte[1024];
			int length = input.read(bytedata);
			output.write(bytedata);
			
			System.out.println("Kich thuoc cua file nhi phan: "+length);
			
			String result = new String(bytedata,0,length);
			
			System.out.print("\n"+result);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Khong tim thay file");
		}finally {
			try {
				input.close();
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
