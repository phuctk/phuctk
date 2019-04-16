package phuck.com.vn;

interface HocInterface{
	int x=5,y=2;
	
	public default int sum() {
		return x + y;
	}
	public default int sub() {
		return x - y;
	}
	public default int mul() {
		return x*y;
		
	}
	public default int div() {
		return x/y;
	}

}


