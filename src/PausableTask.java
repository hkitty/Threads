import java.util.Random;
import java.util.concurrent.*;
import javax.swing.*;

public  class PausableTask implements  Runnable{

 private ExecutorService executor = Executors.newSingleThreadExecutor();
 private Future<?> publisher;
 protected volatile int number;
 protected volatile int limit;
 protected volatile int currentSum;
 protected JButton button;
 protected JTextPane textPane;
 
 
 public PausableTask(int nmb, JButton btn, JTextPane pane){
	 number = nmb;
	 limit = number * 100;
	 button = btn;
	 textPane = pane;
 }
 
 void task() {
	 Random rand = new Random();
	 int randomNum = rand.nextInt(100) + 1;
	 currentSum += randomNum;
	 textPane.setText(textPane.getText() + "Thread " + number + " (limit = " + limit + "): "
	 + randomNum + ", sum = " + currentSum + "\n");
	 if ( currentSum >= limit ) {
		 textPane.setText(textPane.getText() + "Thread " + number + ": Done \n");
		 this.stop();
		 return;
	 }
	 try {
		TimeUnit.MILLISECONDS.sleep(randomNum*50);
	} catch (InterruptedException e) {
	}
}
 
 public void run() {
  while(!Thread.currentThread().isInterrupted()){
	  if(!publisher.isCancelled())
		  task();  
  }
 }

 public void start(){
  publisher = executor.submit(this);
 }
 
 public void pause() {
  publisher.cancel(true);
 }
 
 public void resume() {
  start();
 }
 
 public void stop() {
  button.setText("Done");
  executor.shutdownNow();
 }
 
}
