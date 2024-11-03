package thread;
import java.io.*;

class ThreadJoining extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<2; i++) {
			try {
				Thread.sleep(5000);
				System.out.println("Current Thread : " + Thread.currentThread().getName());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}		
	}
}


public class Multithreading {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();
		
		t1.start();
		
		try {
			System.out.println("Current Thread : " + Thread.currentThread().getName());
			//Thread t1 starts
			t1.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			System.out.println("Current Thread : " + Thread.currentThread().getName());
			//Thread t2 starts until thread t1 is died
			t2.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		t3.start();
		try {
			System.out.println("Current Thread : " + Thread.currentThread().getName());
			//Thread t3 starts until thread t2 is died
			t3.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
