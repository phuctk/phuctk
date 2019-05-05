package phuctk.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import phuctk.java.model.KhachHang;

public class FileProcess {
	
	public void ReadFile(String srcfile)
	{
		//File file = new File(srcfile);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(srcfile);

			System.out.println("Total file size to read (in bytes) : "
					+ fis.available());

			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public void WriteFile(String dstfile) throws FileNotFoundException, IOException
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream(dstfile);
            String text = "Today is a beautiful day";
            byte[] mybytes = text.getBytes();
            fos.write(mybytes);
        } catch(Exception e)
		{
        	e.printStackTrace();
		}
	}
	
	public void CopyFile(String srcfile, String dstfile)
	{
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(dstfile);
			System.out.println("Total file size to read (in bytes) : "
					+ fis.available());

			int content;
			int i = 0;
			while ((content = fis.read()) != -1) 
			{
				// convert to char and display it
				//System.out.print((char) content);
				fos.write(content);
				System.out.println("i = " + i++);
				
			}
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		
	}
	public static void main(String agrs[]) throws FileNotFoundException, IOException
	{
		boolean cont = true;
		while (cont == true)
		{
		System.out.println("Chọn chức năng: Đọc file (d) Ghi file (w) Xóa file (x) Copy File (c) or Thoát (other any key)");	
		Scanner input = new Scanner(System.in);
	 	String s1 = input.nextLine(); 
	 	FileProcess cp = new FileProcess();
	 	switch (s1) {
		case "d":
			System.out.println("Nhập file nguồn");	
			input = new Scanner(System.in);
		 	s1 = input.nextLine();
			cp.ReadFile(s1);
			System.out.println("####");
			System.out.println("#### Đã đọc xong file ####");
			break;
		case "w":
			System.out.println("Nhập file đích");	
			input = new Scanner(System.in);
		 	s1 = input.nextLine(); 
			cp.WriteFile(s1);
			break;
		case "c":
			System.out.println("Nhập file nguồn");	
			input = new Scanner(System.in);
		 	s1 = input.nextLine(); 
		 	System.out.println("Nhập file đích");	
			input = new Scanner(System.in);
		 	String s2 = input.nextLine(); 
		 	cp.CopyFile(s1, s2);
		 	break;
		default:
			cont = false;
			break;
		}
		} 
	
	}

}
