package phuck.com.vn;

import java.util.Scanner;
public class HocSwitch {
	public static double GiaiThua(int n) {
				double m = 1;
			    if (n<0) return - 1;
			    //else if (n ==0 || n==1) return 1;
				//else return GiaiThua(n-1)*n;
			    else  for (int i = 1; i<=n; i++) m *=i;
			    return m;
	}
	public static void GiaiThua() {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		
		while (cont) {
			try {
			System.out.println("Mời bạn nhập N = ");
			int n=input.nextInt();
			System.out.println(n + " giai thừa = " + GiaiThua(n));
			
		} catch (Exception e) {
		
		   cont = false;
		   System.out.println("Bạn nhập vào không phải chữ số, thoát");
	}
		}
	}
		
	

	public static void Checkthang() {
		boolean cont = true;
		int thang;
		
		Scanner sc=new Scanner(System.in);
		do {
		try {
		System.out.println("Mời bạn nhập tháng:");
		thang=sc.nextInt();
		switch(thang)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng  "+thang+" có 31 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng  "+thang+" có 30 ngày");
			break;
		case 2:
			System.out.println("Nếu nhuần thì tháng 2 có 29, ngược lại 28");
			break;
		default:
			System.out.println("Bạn nhập lụi rồi");
			cont = false;
			break;
		} 
		} catch (Exception e) {
			cont = false;
			System.out.println("Bạn đã không nhập tháng rồi, Thoát!!!");
		}
		} while (cont);
		
		}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.println("Chọn chức năng : [A - C]");
			char chon = input.next().charAt(0);
			switch (chon) {
			case 'A':
				System.out.println("Thực hiện chức năng 1: Kiểm Tra Tháng");
				Checkthang();
				break;
			case 'B':
				System.out.println("Thực hiện chức năng 2: Tính Giai Thừa");
				GiaiThua();
				break;
			case 'C':
				System.out.println("Thực hiện chức năng 3");
				break;
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
	}

}
