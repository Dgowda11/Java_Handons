package Threading;

public class MyThread extends Thread{
   
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("i value is : " +i);
		}
		
	}
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
