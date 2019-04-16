package phuck.com.vn;

public class TestThread {

	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.setName("Tiến trình 1");
		t.start();
		
		MyThread1 k=new MyThread1();
		k.setName("Tiến trình 2");
		k.start();
		
		MyThread2 p=new MyThread2();
		Thread tp=new Thread(p);
		tp.setName("Tiến trình 3");
		tp.start();
		
		Thread tp2=new Thread(p);
		tp2.setName("Tiến trình 4");
		tp2.start();
	}

}
 