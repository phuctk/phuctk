package phuck.com.vn;

public class TestInterface implements HocInterface, HocInterface1, Computer {
	int x,y;
	
	public TestInterface(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return HocInterface.super.sum();
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return HocInterface.super.sub();
	}
	
	@Override
	public int mul() {
		// TODO Auto-generated method stub
		return HocInterface1.super.mul();
	}
	@Override
	public int div() {
		// TODO Auto-generated method stub
		return HocInterface1.super.div();
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("This is a Computers");
	}

	@Override
	public void Proccess() {
		// TODO Auto-generated method stub
		System.out.println("Computing ...");
	}

	@Override
	public void Ring() {
		// TODO Auto-generated method stub
		System.out.println("Ringting ...");
	}

	public static void main(String agrs[]) {
    TestInterface a1 = new TestInterface(5,9);
       
    System.out.println("a1 TestInterface sum = " + (double) a1.sum() + "\n");
    System.out.println("a1 TestInterface sub = " + (double) a1.sub() + "\n");
    System.out.println("a1 TestInterface1 mul = " + a1.mul() + "\n");
    System.out.println("a1 TestInterface1 div = " + (double) a1.div() + "\n");
    a1.Display();
	a1.Ring();
	a1.Proccess();
    
	}

	
}

