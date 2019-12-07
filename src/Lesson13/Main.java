package Lesson13;

 class ThreadExample extends Thread {

	   @Override
	   public void run() {

	       System.out.println("Начало работы потока " + getName());

	       try {
	           Thread.sleep(3000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
	       System.out.println("Поток " + getName() +  " завершил работу.");
	   }
	}


	public class Main {

	   public static void main(String[] args) throws InterruptedException {

	       ThreadExample t1 = new ThreadExample();
	       ThreadExample t2 = new ThreadExample();

	       t1.start();


	       						/*Второй поток t2 начнет выполнение только после того, как будет завершен
	       							(или бросит исключение) первый поток - t1*/
	       try {
	           t1.join();
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }

	       t2.start();

	       						//Главный поток продолжит работу только после того, как t1 и t2 завершат работу
	       try {
	           t1.join();
	           t2.join();
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }

	       System.out.println("Все потоки закончили работу, программа завершена");
	   }
	}

//public class Main {
//
//	private static int i = 0;
//private Object dymmy;
//
//	public static void main(String[] args) {
//
////		Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName()), "the");
////		t.start();
////	System.out.println(Thread.currentThread().getName());
//
//		Thread t = new Thread(() -> {
//			int i2 = 0;
//			while (i2 < 100) {
//				increment();
//				i2++;
//			}
//		}, "tHE");
//
//		Thread t2 = new Thread(() -> {
//			int i2 = 0;
//			while (12 < 100) {
//				increment();
//				i2++;
//			}
//		}, "tHEHE");
//
//		t.start();
//		t2.start();
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(i);
//
//	//	t.join();
//		
//
//	}
//
//	public static void increment() {
//		++i;
//	}
//}
