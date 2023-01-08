package Most_Important_Java_Programs;

public class MultiThreading extends Thread {
	
	public void run() {
		System.out.println("Thread is running.");
        System.out.println(
                "Current Thread ID: "
                + Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		MultiThreading m = new MultiThreading();
		Thread t1 = new Thread(m);
		t1.start();
		MultiThreading m1 = new MultiThreading();
		m1.start();
		m.run();
		m.start();
	}

}
