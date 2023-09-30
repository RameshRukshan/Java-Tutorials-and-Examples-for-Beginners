import java.lang.Thread;	//No need to import java lang packages, Those are default

class MyThread extends Thread
{
	public void run()
	{
		for (int c=1; c<=10;c++){
			if(c==7){
				try{
					System.out.println("------------------\nSleeping...");
					Thread.sleep(10000);	//First blocking method Sleep
					System.out.println("------------------");
				}catch(InterruptedException e){
					System.out.println(e.getMessage());
				}
			}
			System.out.println("NIBM Thread "+Thread.currentThread().getName());
		}
	}
}

class Adding extends Thread
{
	public int sum = 0;
	public void run()
	{
//------------------------------------------Use notify and synchronized for wait method
		synchronized(this)
		{
			for (int c=1; c<=10;c++){
				sum = sum + c;
			}
			notify();
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

		mt.suspend();		//Second Blocking Method suspend
		mt.resume();		//Onse you suspend you must resume that

		Adding th = new Adding();
		th.start();
//--------------------------------------------------Third Blocking Mode wait--------------
		synchronized(th)
		{
			try{
				th.wait();
				System.out.println(th.sum);
			}catch(InterruptedException ex){
				System.out.println(ex.getMessage());
			}
		}
	}
}