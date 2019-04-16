package phuck.com.vn;

import java.io.Serializable;

public class SinhVien implements Serializable{
	private String ma;
	private String ten;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public SinhVien(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public SinhVien() {
		super();
	}
	public String toString() {
		return this.ma+"\t"+this.ten;
	}
}
