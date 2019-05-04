package phuctk.java.test;

import java.util.ArrayList;

import phuctk.java.io.SerializeFileFactory;
import phuctk.java.io.TextFileFactory;
import phuctk.java.model.KhachHang;

public class TestKhachHang2 {

	public static void testLuuFile()
	{
		ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Nguyễn Thị An"));
		dsKH.add(new KhachHang("KH02", "Trần Văn Bình"));
		dsKH.add(new KhachHang("KH03", "Hồ Thị Giải"));
		dsKH.add(new KhachHang("KH04", "Hoàng Ngọc Thoát"));
		
		boolean kt=SerializeFileFactory.luuFile(dsKH, "c:\\dulieu.txt");
		if(kt==true)
		{
			System.out.println("Đã lưu file thành công");
		}
		else
		{
			System.out.println("Lưu file thất bại");
		}
	}
	public static void main(String[] args) {
		testLuuFile();
		ArrayList<KhachHang>dsKH=SerializeFileFactory.docFile("c:\\dulieu.txt");
		
		System.out.println("Danh sách khách hàng nạp vào máy tính là:");
		System.out.println("Mã\tTên");
		for(KhachHang kh:dsKH)
		{
			System.out.println(kh);
		}
	}

}
