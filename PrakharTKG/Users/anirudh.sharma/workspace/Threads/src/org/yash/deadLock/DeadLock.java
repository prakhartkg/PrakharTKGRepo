package org.yash.deadLock;

public class DeadLock {
	
		String h="Hello";
		String h2="World";
	public DeadLock() {
		new Thread("Sun"){
			public void run(){
			
					synchronized (h) {
						System.out.println("locl on h");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						synchronized (h2) {
							System.out.println("lock on h2");
							
						}
					}
				
				
			}
		}.start();
		
		new Thread("Moon"){
			public void run(){
				
				synchronized (h2) {
					System.out.println("Lock on h2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (h) {
						System.out.println("lock on h");
						
					}
				
			
			}
			}
		}.start();
	
	}
		
	
	public static void main(String[] args) {
		
		System.out.println("Main starts");
		DeadLock d=new DeadLock();
		System.out.println("Main ends");
	}
	
}
