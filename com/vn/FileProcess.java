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
		/*
		 * try { // Đọc file: Input FileInputStream fis = null ; InputStreamReader
		 * isr=new InputStreamReader(fis, "UTF-8"); BufferedReader br=new
		 * BufferedReader(isr);
		 * 
		 * // Ghi file: 
		 * Output FileOutputStream fos=new FileOutputStream(dstfile);
		 * OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8"); BufferedWriter
		 * bw=new BufferedWriter(osw);
		 * 
		 * String line=br.readLine(); try {
		 * 
		 * fis = new FileInputStream(srcfile);
		 * System.out.println("Total file size to read (in bytes) : " +
		 * fis.available());
		 * 
		 * int content; while ((content = fis.read()) != -1) { // convert to char and
		 * display it System.out.print((char) content); fos.write(content);
		 * 
		 * } fos.write(1); fos.close();
		 * 
		 * } catch (IOException e) { e.printStackTrace(); } finally { try { if (fis !=
		 * null) fis.close(); } catch (IOException ex) { ex.printStackTrace(); } }
		 * br.close(); isr.close(); fis.close(); // phải đóng file nếu ko dữ liệu lưu
		 * xuống file = rỗng bw.close(); osw.close(); //fos.close(); } catch(Exception
		 * ex) { ex.printStackTrace(); }
		 */
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
		System.out.println("Nhập file nguồn");	
		Scanner input = new Scanner(System.in);
	 	String s1 = input.nextLine(); 
	 	System.out.println("Nhập file đích");	
		input = new Scanner(System.in);
	 	String s2 = input.nextLine(); 
	 	FileProcess cp = new FileProcess();
	  	//cp.ReadFile(s1);
	 	//cp.WriteFile(s2);
	 	cp.CopyFile(s1, s2);
	 	
	}

}
