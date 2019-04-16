package phuck.com.vn;

public class MyThread implements Runnable
{

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ==>i="+i);
		}
	}
	
}