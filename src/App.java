import java.io.IOException;
import java.util.Vector;
import java.util.concurrent.*;

class App {
	public static void main(String[] args) {
		
		Vector<PausableTask> vec = new Vector<PausableTask>(); 
		for (int i = 0; i < 3; i++) {
			PausableTask task = new PausableTask(i+1);
			vec.add(task);
			task.start();
		}
		/*
		int st = 0;
		try {
			st = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(st == 50) {
		task.pause();
		}
		//System.out.println(st);
		 */
	}
}