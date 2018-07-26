package main;

public class HalfThread extends Thread{
	Box b;
	public HalfThread(Box b) {
		super();
		this.b = b;
	}
   public void run()
   {
	   while(true)
	   {
	   b.half();
	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   }
}
