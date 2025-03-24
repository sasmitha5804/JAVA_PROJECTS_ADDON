package javaday5_project;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}
public class Main {

	public static void main(String[] args) {
		MyThread thread1 =new MyThread();
		thread1.start();
	}

}
