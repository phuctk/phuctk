package phuck.com.vn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TestSinhVien {
	public static boolean luuFileSerialize(ArrayList<SinhVien> ds,String path)
	{
		try
		{
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ds);
			oos.close();
			fos.close();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	public static ArrayList<SinhVien>docSerialize(String path)
	{
		ArrayList<SinhVien>ds=new ArrayList<SinhVien>();
		try
		{
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			ds= (ArrayList<SinhVien>) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ds;
	}
	
	public static boolean luuFile(ArrayList<SinhVien> ds,String path)
	{
		try
		{
			FileOutputStream fos=new FileOutputStream(path);
			OutputStreamWriter osw=
					new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw=new BufferedWriter(osw);
			for(SinhVien sv: ds)
			{
				String line=sv.getMa()+";"+sv.getTen();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	public static ArrayList<SinhVien>docFile(String path)
	{
		ArrayList<SinhVien>ds=new ArrayList<SinhVien>();
		try
		{
			FileInputStream fis=new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
			BufferedReader br=new BufferedReader(isr);
			String line=br.readLine();
			while(line!=null)
			{
				String arr[]=line.split(";");
				if(arr.length==2)
				{
					SinhVien sv=new SinhVien(arr[0], arr[1]);
					ds.add(sv);
				}
				line=br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ds;
	}
	public static void main(String[] args) {
		ArrayList<SinhVien>ds=new ArrayList<SinhVien>();
		ds.add(new SinhVien("sv1: ", "nguyễn thị an"));
		ds.add(new SinhVien("sv2: ", "trần văn bình"));
		ds.add(new SinhVien("sv3: ", "hồ thị giải"));
		ds.add(new SinhVien("sv4: ", "cao văn thoát"));
		
		boolean ret= luuFile(ds, "E:\\Code\\Java\\Array\\src\\phuck\\com\\vn\\datasv.txt");
		if(ret)
		{
			System.out.println("Lưu file thành công");
		}
		else
		{
			System.out.println("Lưu file thất bại");
		}
		
		/*ArrayList<SinhVien>ds=docFile("F:\\Topica pedia\\datasv.txt");
		for(SinhVien sv:ds)
		{
			System.out.println(sv);
		}
		
		ArrayList<SinhVien>ds=new ArrayList<SinhVien>();
		ds.add(new SinhVien("sv1", "nguyễn thị an"));
		ds.add(new SinhVien("sv2", "trần văn bình"));
		ds.add(new SinhVien("sv3", "hồ thị giải"));
		ds.add(new SinhVien("sv4", "cao văn thoát"));
		
		boolean ret= luuFileSerialize(ds, "F:\\Topica pedia\\datasv.txt");
		if(ret)
		{
			System.out.println("Lưu file thành công");
		}
		else
		{
			System.out.println("Lưu file thất bại");
		}
		
		/*ArrayList<SinhVien>ds=docSerialize("E:\\Code\\Java\\Array\\src\\phuck\\com\\vn\\datasv.txt");
		for(SinhVien sv:ds)
		{
			System.out.println(sv);
		}*/
	}
}
