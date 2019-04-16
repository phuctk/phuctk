package phuck.com.vn;

public class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+", i="+i);
			try
			{
			Thread.sleep(500);
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}