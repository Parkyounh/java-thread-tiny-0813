package thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start();
		
		Thread th1 = new Thread(()->{
			for(int i=0; i<5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(500);   //0.5초 지연 500ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
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
