package thread;

public class BeepTask2 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);   //0.5초 지연 500ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
