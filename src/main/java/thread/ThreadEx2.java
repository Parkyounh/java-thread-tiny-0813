package thread;

public class ThreadEx2 {
	public static void main(String[] args) {
		Thread th = new BeepTask2();
		th.start();
		
		
		
		for(int i=0; i<5; i++) {
			System.out.println("삐");
			try {
				Thread.sleep(500);   //0.5초 지연 500ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
