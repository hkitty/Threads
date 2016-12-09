import java.util.Random;
import java.util.concurrent.*;

public  class PausableTask implements  Runnable{

 private ExecutorService executor = Executors.newSingleThreadExecutor();
 private Future<?> publisher;
 protected volatile int number;
 protected volatile int limit;
 protected volatile int currentSum;
 
 
 public PausableTask(int nmb){
	 number = nmb;
	 limit = number * 100;
 }
 private void someJob() {
  System.out.println("Job Done :- " + number);

 }
 
 void task() {
	 Random rand = new Random();
	 int randomNum = rand.nextInt(100) + 1;
	 currentSum += randomNum;
	 System.out.println("Thread " + number + " (limit = " + limit + "): " + randomNum + 
			 ", sum = " + currentSum);
	 if ( currentSum >= limit ) {
		 System.out.println("Thread " + number + ": Done");
		 this.stop();
		 return;
	 }
	 try {
		TimeUnit.MILLISECONDS.sleep(randomNum*50);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
}
 
 public void run() {
  while(!Thread.currentThread().interrupted()){
   task();  
  }
 }

 public void start(){
  publisher = executor.submit(this);
 }
 
 public void pause() {
  //counter = 100;
  publisher.cancel(true);
 }
 
 public void resume() {
  //counter = 200;
  start();
 }
 
 public void stop() {
  //counter = 300;
  executor.shutdownNow();
 }
}
