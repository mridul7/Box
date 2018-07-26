//first change
package main;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class Box {
int length,breadth,height;
ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
public Box(int l, int b, int h) {
	super();
	this.length = l;
	this.breadth = b;
	this.height = h;
}
public void show()
{
	ReadLock rlock = lock.readLock();
	rlock.lock();
	System.out.println(this.length+","+this.breadth+","+this.height);
	  System.out.println("inside show function");
	rlock.unlock();
}
public void twice()
{
	WriteLock wlock1 = lock.writeLock();
	wlock1.lock();
    this.length =2*this.length;
    this.breadth = 2*this.breadth;
   
   this.height=2*this.height;
   System.out.println("inside twice function");
    wlock1.unlock();
	
}
public void half()
{
	WriteLock wlock2 = lock.writeLock();
	wlock2.lock();
    this.length =this.length/2;
   
    this.breadth = this.breadth/2;
    this.height=this.height/2;
    System.out.println("inside half function");
    wlock2.unlock();
	
}
}
