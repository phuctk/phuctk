package phuck.com.vn;

public interface HocInterface1 {
	int x = 7, y = 2;
	public default int sum() {
		return x + x + y + y;
	}
	public default int sub() {
		return (x + x) - (y + y);
	}
	public default int mul() {
		return x*x*y*y;
		
	}
	public default int div() {
		return (x*x)/(y*y);
	}
}
