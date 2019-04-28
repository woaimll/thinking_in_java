package chapter21;

public class DaemonSpawn implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			Thread.yield();
	}
	
}
