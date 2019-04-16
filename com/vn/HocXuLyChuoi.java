package phuck.com.vn;

import java.util.Scanner;

public class HocXuLyChuoi {

	public static void main(String[] args) {
		String s="5 Topica Education 3";
		System.out.println("Chiều dài của chuỗi = "+s.length());
		
		//Đếm xem chuỗi có bao nhiêu chữ In Hoa, in thường, số:
		char []arr=s.toCharArray();
		int soInHoa=0;
		int soInThuong=0;
		int soChuSo=0;
		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i];
			if(Character.isUpperCase(c))
			{
				soInHoa++;
			}
			if(Character.isLowerCase(c))
			{
				soInThuong++;
			}
			if(Character.isDigit(c))
			{
				soChuSo++;
			}
		}
		System.out.println("Chuỗi có "+soInHoa +" ký tự hoa");
		System.out.println("Chuỗi có "+soInThuong+" ký tự in thường");
		System.out.println("Chuỗi có "+soChuSo+" chữ số");
		
		String bh1="d:/music/nhactrinh/riengmotgoctroi.mp3";
		//String bh2="d:\\mucsic\\nhactrinh\\riengmotgoctroi.mp3";
		int vtcuoi=bh1.lastIndexOf("/");
		String tenBaiHat=bh1.substring(vtcuoi+1);
		System.out.println("Tên bài hát = "+tenBaiHat);
		
		int vtCuoiDauCham=bh1.lastIndexOf(".");
		tenBaiHat=bh1.substring(vtcuoi+1, vtCuoiDauCham);
		System.out.println("Tên bài hát ko có đuôi ="+tenBaiHat);
		System.out.println("################################");
		String chuoi;
	    char kyTu;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào chuỗi bất kỳ: ");
	    chuoi = scanner.nextLine();
	         
	    System.out.println("Các ký tự có trong chuỗi là: ");
	    for (int i = 0; i < chuoi.length(); i++) {
	        // trả về ký tự tại vị trí thứ i trong chuỗi
	        // và gán vào cho biến kyTu
	        // i chạy từ 0 đến vị trí độ dài của chuỗi - 1
	        kyTu = chuoi.charAt(i);
	        System.out.println(kyTu);
	        
	    System.out.println("######################################");
	        String s3 = "        Con đường Chúng ta đi Thật Tươi Đẹp.mp3      ";
	        String s1 = "Những Con đường Chúng ta đi Thật Tươi Đẹp.mp3";
		    String s2 = "Con đường";
		char arr1[] = s3.toCharArray();
		byte demchuHoa  = 0;
		byte demchuThuong = 0;
		byte demso = 0;
		for (int j = 0; j < arr1.length;j++) {
			char ch = arr1[j];
			if (Character.isUpperCase(ch)) demchuHoa++;  
			if (Character.isLowerCase(ch)) demchuThuong++;
			if (Character.isDigit(ch)) demso++;
		}
		System.out.println("Độ dài chuỗi = " + s3.length());
		System.out.println("Số chữ Hoa là \n" + demchuHoa);
		System.out.println("Số chữ Thường là \n" + demchuThuong);
		System.out.println("Số chữ Số là \n" + demso);
		System.out.println(s3.trim());
		System.out.println(s1.lastIndexOf(s2));
		String bh3="/a/b";
		System.out.println("Vị trí cuối của / là " + bh3.lastIndexOf("/"));
		System.out.println("Vị trí cuối của b là " + bh3.lastIndexOf("b"));
	}

}
}
