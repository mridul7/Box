package main;

public class ShowThread extends Thread{
Box b;

public ShowThread(Box b) {
	super();
	this.b = b;
}
public void run()
{
	while(true)
	{
	b.show();
	try {
		Thread.sleep(1700);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
