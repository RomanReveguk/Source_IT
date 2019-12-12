package dz_hw14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task5 {

	public static void main(String[] args) {
	
		
		HW13_Task5_Resourse res = new HW13_Task5_Resourse();
		ExecutorService executor = Executors.newFixedThreadPool(4);

		Thread writer = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 1;
				while (i < 4) {
					try {
						System.out.println("writer: " + i);
						res.writeBuffer("11111");
						i++;
						Thread.sleep(200);
					} catch (InterruptedException e) {
					} finally {

					}

				}
			}

		});

		Thread reader1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 1;
				while (i < 4) {

					try {
						System.out.println("reader1: " + i + " " + res.readBuffer());
						i++;
						Thread.sleep(250);
					} catch (InterruptedException e) {
					} finally {
					}
				}
			}

		});

		Thread reader2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 1;
				while (i < 4) {

					try {
						System.out.println("reader2: " + i + " " + res.readBuffer());
						i++;
						Thread.sleep(300);
					} catch (InterruptedException e) {
					} finally {
					}
				}
			}

		});

		Thread reader3 = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 1;
				while (i < 4) {

					try {
						System.out.println("reader3: " + i + " " + res.readBuffer());
						i++;
						Thread.sleep(350);
					} catch (InterruptedException e) {
					} finally {
					}
				}
			}

		});

		executor.submit(writer);
		executor.submit(reader1);
		executor.submit(reader2);
		executor.submit(reader3);
		
		
	}

}