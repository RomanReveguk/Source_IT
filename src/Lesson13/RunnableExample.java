package Lesson13;

//class MyThread implements Runnable {
//	Thread thread;
//
//	MyThread() {
//		thread = new Thread(this, "Дополнительный поток");
//		System.out.println("Создан дополнительный поток " + thread);
//		thread.start();
//	}
//
//	@Override
//	public void run() {
//		try {
//			for (int i = 5; i > 0; i--) {
//				System.out.println("\tдополнительный поток: " + i);
//				Thread.sleep(10);
//			}
//		} catch (InterruptedException e) {
//			System.out.println("\tдополнительный поток прерван");
//		}
//		System.out.println("\tдополнительный поток завершён");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//
//public class RunnableExample {
//	public static void main(String[] args) {
//		new MyThread();
//		try {
//			for (int i = 5; i > 0; i--) {
//				System.out.println("Главный поток: " + i);
//				Thread.sleep(100);
//			}
//		} catch (InterruptedException e) {
//			System.out.println("Главный поток прерван");
//		}
//		System.out.println("Главный поток завершён");
//		System.out.println(Thread.currentThread().getName());
//	}
//}