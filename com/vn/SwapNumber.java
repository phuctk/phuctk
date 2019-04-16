package phuck.com.vn;

public class SwapNumber {
	
	static int a;
	static int b;
	public SwapNumber(int x, int y) {
		super();
		a = x;
		b = y;
		// TODO Auto-generated constructor stub
	}
	
	public static void Init(int x, int y) {
		a = x;
		b = y;
	}
	public static void Swap() {
		int temp;
		temp = a; 
		a = b;
		b = temp; // Thuc hien Hoan doi bien 
	}
	public static void main(String[] agrs) {
		SwapNumber sw1 = new SwapNumber(1,2);
		System.out.println("a = " + a + ", b = " + b + "\n");
		sw1.Swap();
		System.out.println("a = " + a + ", b = " + b + "\n");
	}

}
