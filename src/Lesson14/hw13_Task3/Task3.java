package Lesson14.hw13_Task3;


/*Задание 3
Создать класс с двумя отдельными счетчиками и объект этого класса. 
Создать несколько одинаковых потоков, каждый из которых повторяет следующее: 
сравнивает значение счетчиков и печатает результат сравнения, увеличивает первый счетчик, 
засыпает на 10 мсек, а затем увеличивает второй счетчик. 
Сравнить работу программы при условии, что упомянутый блок кода синхронизирован и не синхронизирован.
 */

public class Task3 {
	private static int i1 = 0;
	private static int i2 = 0;
	static Task3 n = new Task3();
	private static final Object synch = new Object();

	public static void main(String[] args) {
		n.Thread1();
		n.Thread2();

	}

	public synchronized void Thread1() {
		 Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(getCount1() + " == " + getCount2() + ":" + (getCount1() == getCount2())+" "+Thread.currentThread().getName());
					incrementCount1();
					incrementCount2();

				}

			}
		});
		t1.start();
	}

	public void Thread2() {
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(getCount1() + " == " + getCount2() + ":" + (getCount1() == getCount2())+" "+Thread.currentThread().getName());
					incrementCount1();
					incrementCount2();
				}
			}
		});
		t2.start();
	}

	private  static int getCount1() {
		synchronized (synch) {
			return i1;
		}
	}

	private  static int getCount2() {
		synchronized (synch) {
			return i2;
		}
	}

	private static void incrementCount1() {
		synchronized (synch) {
			i1++;
			
		}

	}

	private static void incrementCount2() {
		synchronized (synch) {
			i2++;
			
		}
	}

}