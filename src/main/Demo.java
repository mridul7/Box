package main;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Box b = new Box(10,10,10);
    HalfThread half=new HalfThread(b);
    ShowThread show1 = new ShowThread(b);
 
    DoubleThread doubl = new DoubleThread(b);
   // ShowThread show2 = new ShowThread(b);
    half.start();
    show1.start();
 
    doubl.start();
   // show2.start();
    

       
	}

}
