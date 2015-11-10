package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 	|_SyncTest
 * 
 * 개요 : 
 * 작성일 : Nov 9, 2015
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class SyncTest {
	
	int data = 0;
	
	public static void main(String[] args) {
		SyncTest s = new SyncTest();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run () {
				System.out.println(Thread.currentThread() + "start");
				s.add();
				System.out.println(Thread.currentThread() + "end");
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run () {
				System.out.println(Thread.currentThread() + "start");
				s.add();
				System.out.println(Thread.currentThread() + "end");
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s.data);
	}
	
	private void add(){
		for(int i = 0; i < 20000; i++) {
			synchronized (this) {
				data++;
			}
		}
	}

}
