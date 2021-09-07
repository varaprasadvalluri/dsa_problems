package com.problems;

public class UtilDeadLock {

	static Object lock1 = new Object();
	static Object lock2 = new Object();

	public static void main(String args[]) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
	}

	private static class ThreadDemo1 extends Thread {

		public void run() {
			synchronized (lock1) {
				System.out.println("thread1 holding lock1");
				try {
					Thread.sleep(10);

				} catch (Exception e) {
				}
				System.out.println("waiting");
				synchronized (lock2) {
					System.out.println("Thread1 :holding lock1 and lock2 ");
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 2: Holding lock 1...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 2...");

				synchronized (lock2) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
}
