package phuck.com.vn;

import java.util.Arrays;
import java.util.Random;

public class Array_numbs {
	    static private int a[];
	    
	    public void Init(int n){ // Khoi tao mang voi n phan tu
	    	a = new int[n];
	    	Random rd = new Random();
	    	for (int i = 0; i<n;i++) a[i] = rd.nextInt();
	    	
	    	
	    }
	    public static void Display() { // Hien thi mang
	    	try {
	    	for (int i = 0; i<a.length;i++) 
	    		{
	    			System.out.println("a[" + i + "]= " + a[i] + "\t");
	    			if (i == a.length-1) System.out.println("Đã hiển thị xong Đối tượng mảng \n");
	    		}
	    	} catch (Exception E) 
	    	{
	    		System.out.println(E.toString());
	    	}
	    }
	    public static void Display(int n) { // Hien thi mang với so bien dau tien cua mang
	    	if (n <= a.length) 
	    		{ 
	    		  for (int i = 0; i<n;i++) System.out.println("a[" + i + "]= " + a[i] + "\t");
	    		  System.out.println("Đã hiển thị xong Đối tượng mảng với " + n + " phần tử \n");
	    		}
	    	else System.out.println("Hiển thị quá số phần tử");
	    	
	    }
	    public static void Swap(int a, int b) {
	    	/*System.out.println("a = " + a + ", b = " + b + "\n");
	    	int temp = a;
	    	a = b;
	    	b = temp;
	    	System.out.println("a = " + a + ", b = " + b + "\n");*/
	    	SwapNumber swn = new SwapNumber(a,b);
	    	swn.Swap();
	    	a = swn.a;
	    	b= swn.b;
	    	
	    	
	    }
	    public static int getItself(int a, int b)
	    {
	        return a;
	    }
	    public static void Swap1(int a, int b) {
	    	a = getItself(b,b=a);
	    }
	    public static void Short() {
	    	int i,j;
	    	int n = a.length;
	    	System.out.println("Bắt đầu sắp xếp các phần tử mảng\n");
	    	for(i=0;i<n-1;i++)
	    	{
	    		for(j=i+1;j<n;j++)
	    		{
	    			if(a[i]>a[j]) 
	    			{
	    				System.out.println("Trước swap: [a" + i + "]= " + a[i] + " [a" + j + "]= " + a[j] + "\n"  );
	    				int temp = a[i];
	    				a[i] = a[j];
	    				a[j] = temp;
	    				System.out.println("Sau swap: [a" + i + "]= " + a[i] + " [a" + j + "]= " + a[j] + "\n"  );
	    				//Swap(a[i],a[j]);
	    				/*SwapNumber Sw = new SwapNumber(a[i],a[j]);
	    				System.out.println("Trước Sw: Sw.a = " + Sw.a + " Sw.b = " + Sw.b );
	    				Sw.Swap();
	    				System.out.println("Sau Sw: Sw.a = " + Sw.a + " Sw.b = " + Sw.b );
	    				a[i] = Sw.a;
	    				a[j] = Sw.b;*/
	    				
	    		    }
	    	    }
	    	}
	    	//Arrays.sort(a);
	    	//Xuat
	    	for(j=0;j<n;j++)
	    	{
	    		
	    		System.out.println("a[" + j + "]= " + a[j] + "\t");
	    	}
	    	System.out.println("Đã sắp xếp xong các phần tử mảng\n");
	    }
		public static void main(String[] agrs) {
			Array_numbs A = new Array_numbs();
			Array_numbs B = new Array_numbs();
			A.Init(10);
			A.Display();
			A.Display(7);
			A.Short();
			A.Display();
			B.Init(50);
			//Arrays.sort(a);
			//B.Display();
			System.out.println("MIN INTEGER = " + Integer.MIN_VALUE);
			int a  =5, b = 8;
			Swap(a,b);
			System.out.println("a = " + a + ", b = " + b + "\n");
			Swap1(a,b);
			System.out.println("a = " + a + ", b = " + b + "\n");
			int g = 5, h = 6;
			SwapNumber Sw = new SwapNumber(g,h);
			System.out.println("Trước Sw: Sw.a = " + Sw.a + " Sw.b = " + Sw.b );
			Sw.Swap();
			System.out.println("Sau Sw: Sw.a = " + Sw.a + " Sw.b = " + Sw.b );
			
		}
}
	
