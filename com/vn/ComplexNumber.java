package phuck.com.vn;

public class ComplexNumber  implements Complex  {
	int a,b;

	public ComplexNumber(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	private ComplexNumber ComplexNumber(int a, int b) {
		// TODO Auto-generated method stub
		return ComplexNumber(a,b);
	}


	@Override
	public ComplexNumber sum(ComplexNumber x, ComplexNumber y) {
		// TODO Auto-generated method stub
		return ComplexNumber(x.a+y.a, x.b + y.b);
	}

	
	@Override
	public ComplexNumber sub(ComplexNumber x, ComplexNumber y) {
		// TODO Auto-generated method stub
		return ComplexNumber(x.a-y.a, x.b - y.b);
	}

	@Override
	public ComplexNumber mul(ComplexNumber x, ComplexNumber y) {
		// TODO Auto-generated method stub
		return ComplexNumber(x.a*y.a, x.b*y.b);
	}

	@Override
	public ComplexNumber div(ComplexNumber x, ComplexNumber y) {
		// TODO Auto-generated method stub
		return ComplexNumber(x.a/y.a, x.b/y.b);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(a + "+" + b + "i");
	}
	public static void main(String[] agrs) {
		ComplexNumber A = new ComplexNumber(5,3);
		ComplexNumber B = new ComplexNumber(9,8);
		A.display();
		B.display();
	}

	
	
}
