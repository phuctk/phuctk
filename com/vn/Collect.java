package phuctk.java.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Collect {
	public static int fn(int x,int y)
	{
		return x+y;
	}
	public static double fn(double x,double y)
	{
		return x+y+100;
	}
	public static int fn(int x,int y,int z)
	{
		return x+y+z;
	}
	public static int fn(int x)
	{
		return x;
	}
	//ctrl+shift+/
	/*public static int fn3(int x,int y)
	{
		
	}
	public static double fn3(int x,int y)
	{
		
	}*/
	//parameter list
	public static int fn(int ...arr)
	{
		int sum=0;
		for(int x: arr)
			sum+=x;
		return sum;
	}
	public static void main(String agrs[]) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ArrayList<Calculator> arrl1 = new ArrayList<Calculator>();
		Random rd = new Random();
		for (int i = 0; i < 10; i++) arrl1.add(new Calculator(rd.nextInt(i+1),rd.nextInt(i+1),"+"));
		for (Calculator cal : arrl1)
		{
			System.out.print(cal.calculate(cal.getA(), cal.getB(), cal.getOperator()) + " ");
		}
		for (Calculator cal : arrl1)
		{
			System.out.println(cal.toString());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (int i = 5; i < 8; i ++) arrl1.remove(i);
		int j = 0;
		for (Calculator cal : arrl1)
		{
			System.out.println(cal.toString() + " " + j++ + " ");
		}
		boolean cont = true;
		while (cont == true)
		{
			System.out.println("Chọn chức năng: Thêm (t) or Bớt (b) or Sửa (s) or Xóa (x) or Đọc (d) or Lưu (l) or Thoát (n)");
			Scanner input1 = new Scanner(System.in);
			String s = input1.nextLine();
			switch (s)
			{
			 case "b": 
				 System.out.println("Nhập phần tử thứ i muốn bớt");
					Scanner input = new Scanner(System.in);
					int k = input.nextInt();
					try
					{
					arrl1.remove(k);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Vượt quá kích thước dãy số hoặc dãy đã rỗng" + e.toString());
						continue;
					}
					j = 0;
					for (Calculator cal : arrl1)
					{
						System.out.println(cal.toString() + " " + j++ + " ");
					}
					cont = true;
					break;
			 case "t":
				 System.out.println("Nhập giá trị k muốn thêm");
					input = new Scanner(System.in);
					k = input.nextInt();
					arrl1.add(arrl1.size(), new Calculator(k,k,"+"));
					j=0;
					for (Calculator cal : arrl1)
					{
						System.out.println(cal.toString() + " " + j++ + " ");
					}
					cont = true;
					break;
			 case "s":
				 System.out.println("Nhập vị trí k muốn sửa");
					input = new Scanner(System.in);
					k = input.nextInt();
				 System.out.println("Nhập giá trị a muốn sửa");	
				 	input = new Scanner(System.in);
				 	int a = input.nextInt();
				 System.out.println("Nhập giá trị a muốn sửa");	
				 	input = new Scanner(System.in);
				 	int b = input.nextInt(); 
				 System.out.println("Nhập giá trị operator muốn sửa");	
					 	input = new Scanner(System.in);
					 	s = input.nextLine(); 
				arrl1.set(k, new Calculator(a,b,s))	;
				j=0;
				for (Calculator cal : arrl1)
				{
					System.out.println(cal.toString() + " " + j++ + " ");
				}
				cont = true;
				break;
			 case "x":
				 System.out.println("Xác nhận muốn xóa toàn bộ List 'y' or any key to out");
					input = new Scanner(System.in);
					String k1 = input.nextLine();
					System.out.println(k1);
				switch (k1) 
				{
					case "y":
					arrl1.clear();
					System.out.println(arrl1.toString());
					break;
					default:
					break;
				}
				break;
				
			 case "d":
				 System.out.println("Nhập file muốn đọc");	
					input = new Scanner(System.in);
				 	s = input.nextLine(); 
				 	ObjectInputStream ois=new ObjectInputStream(new FileInputStream(s));
				 	k = 0;
				 	try
				 	{
				 	while (true)
				 	{
				 		System.out.println(ois.readObject());
				 		k++;
				 	}
				 	} catch (Exception e) {
						// TODO: handle exception
				 		System.out.println("Total Object Count int file " + k);
					}
				 	ois.close();
				 break;
				
			 case "l":
				 
				 try
					{
					 System.out.println("Nhập file muốn lưu");	
					 	input = new Scanner(System.in);
					 	s = input.nextLine(); 
					 	
						ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(s));
						j=0;
						for (Calculator cal : arrl1)
						{
							System.out.println(cal.toString());
							oos.writeObject(cal.toString());
						}
						oos.close();
						
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				 cont = true;
					break;
			 case "n":
				 cont = false;
				 break;
			}
			
		}
		System.out.println(arrl1.toString());
		System.out.println(fn(5,6,5,7,8,9,99,88,77));
String s="học , học , học, học nữa... học, mãi";
		
		StringTokenizer token=new StringTokenizer(s);
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
		System.out.println("======================");
		StringTokenizer token2=new StringTokenizer(s,",");
		while(token2.hasMoreTokens())
		{
			System.out.println(token2.nextToken());
		}
		
		StringTokenizer token3=new StringTokenizer(s,", ");
		System.out.println("======================");
		while(token3.hasMoreTokens())
		{
			System.out.println(token3.nextToken());
		}
		StringBuilder builder=new StringBuilder();
		
		for(int i=0;i<Integer.MAX_VALUE/10000000;i++)
		{
			builder.append("Phần tử thứ "+i);
			builder.append("\n");
		}
		System.out.println(builder.toString());
		System.out.println("Nhập file muốn lưu");	
		Scanner input = new Scanner(System.in);
	 	s = input.nextLine(); 
	 	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(s));
		oos.writeObject(builder);
		oos.close();
		System.out.println(builder.toString());
		System.out.println("Nhập file muốn đọc");	
		input = new Scanner(System.in);
	 	s = input.nextLine(); 
	 	ObjectInputStream ois=new ObjectInputStream(new FileInputStream(s));
	 	int k = 0;
	 	try
	 	{
	 	while (true)
	 	{
	 		System.out.println(ois.readObject());
	 		k++;
	 	}
	 	} catch (Exception e) {
			// TODO: handle exception
	 		System.out.println("Total Object Count int file " + k);
		}
	 	ois.close();
	 	System.out.println("Nhập file muốn lưu");	
		input = new Scanner(System.in);
	 	String s1 = input.nextLine(); 
	 	oos=new ObjectOutputStream(new FileOutputStream(s));
	 	try
	 	{
	 	while (true)
	 	{
	 		oos.writeObject(ois.readObject());
	 		k++;
	 	}
	 	} catch (Exception e) {
			// TODO: handle exception
	 		System.out.println("Total Object Count int file " + k);
		}
		oos.close();
	}

}
