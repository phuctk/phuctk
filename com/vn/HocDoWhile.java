package phuck.com.vn;

public class HocDoWhile {

	public static void main(String[] args) {
		int n=1;
		int i=1;
		do
		{
			n*=i;
			i++;
		}
		while(i<=5);
		System.out.println("5!="+n);
		
		Thread th1=new Thread(new Runnable() {
			
			public void run() {
				for(int i=0;i<5;i++)
				{
					System.out.println(Thread.currentThread().getName()+" ==>i="+i);
				}
			}
		});
		
		Thread th2=new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++)
				{
					System.out.println(Thread.currentThread().getName()+" ==>i="+i);
				}

			}
		});
		
		th1.start();
		th2.start();
		
		
		Runnable th3=new MyThread();
		Thread th4=new Thread(new MyThread());
		
		th4.start();
	}
}
		