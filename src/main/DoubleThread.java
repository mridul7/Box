package main;

public class DoubleThread extends Thread {
Box b;

public DoubleThread(Box b) {
	super();
	this.b = b;
}
public void run()
{
	while(true) {
	b.twice();
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
