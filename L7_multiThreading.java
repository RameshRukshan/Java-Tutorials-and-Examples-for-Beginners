import java.lang.Thread;	//No need to import java lang packages, Those are default

class MyThread extends Thread
{
	public void run()
	{
		for (int c=1; c<=10;c++){
			System.out.println("NIBM Thread "+Thread.currentThread().getName());
		}
	}
}

class TThread extends Thread
{
	public void run()
	{
		for(int x=0;x<=10;x++){
			System.out.println(x);
		}
	}
}

class MainC
{
	public static void main(String args[])
	{
		MyThread mt = new MyThread();		//create a thread
		mt.setName("Thread One");
		mt.start();				//execute run methord

		MyThread mt2 = new MyThread();
		mt2.setName("Thread Two");
		mt2.start();

		TThread mt3 = new TThread();
		mt3.setName("Thread Three");
		mt3.start();
	}
}