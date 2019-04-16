package phuck.com.vn;

public class MyThread2 implements Runnable{

	int x=1;
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+", i="+i+"\n\tx="+x);
			x++;
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
