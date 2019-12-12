package dz_hw14;

public class PrintName {
	public static void main(String[] args) throws Exception {
		MyNewThread t1 = new MyNewThread();
		t1.start();
		
		MyNewThread t2 = new MyNewThread();
		t1.join(); 
		t2.start();
		
	}
}

class MyNewThread extends Thread {
	@Override
	public void run() {

		System.out.println("Начало работы потока " + getName());

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Поток " + getName() + " завершил работу.");
	}

}

class MyRunnable implements Runnable {
	@Override
	public void run() {

		System.out.println("Начало работы потока ");

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Поток завершил работу.");
	}

}