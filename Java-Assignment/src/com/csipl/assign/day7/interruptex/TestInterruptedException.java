package com.csipl.assign.day7.interruptex;
/*
 * 
 * Q5.Thread Interrupted Exception
 * 
 */
public class TestInterruptedException {

	public static void main(String[] args) {
		System.out.println("\t\t\t===Q5. Interrupted Exception===");
		//here got the reference of main Thread
		Thread mainThread = Thread.currentThread();
		Thread interruptedThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					throw new RuntimeException("Thread Got Interrupted...");
				}

			}
		});
		// child thread start();
		interruptedThread.start();
		// here child thread got interrupted by main thread
		interruptedThread.interrupt();
	}

}
