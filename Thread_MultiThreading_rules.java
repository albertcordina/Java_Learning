/*https://www.youtube.com/watch?v=r_MbozD32eo
 *
    A thread is a thread of execution in a program.
    The Java Virtual Machine allows an application to have multiple threads of execution running concurrently.
    Every thread has a priority. Threads with higher priority are executed in preference to threads with lower priority.
 *
 * The 'extends Thread' and 'implements Runnable' have the same function, the only difference is that
 * the implements Runnable allows us to use other interfaces and to extend to another class;
 */
class Multi implements Runnable {
//class Multi extends Thread {

    private int threadNumber;
    public Multi (int threadNumber) { this.threadNumber = threadNumber;}


    public void run() {

        for (int i = 1; i < 6; i++) {
            //System.out.println(i);
            System.out.println("Round " + i + " from thread " + threadNumber);

            try { Thread.sleep(1000);} // 'sleep' method pauses the execution of the incrementation above inside the method;
            catch (InterruptedException e) { e.printStackTrace();}
        }
    }
}

public class Thread_MultiThreading_rules {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 3; i++) {   // for number of threads
            Multi mul = new Multi (i); // via the constructor above;
//			mul.start(); // <--- if we use the extends 'Thread';

            Thread myThread = new Thread (mul); // <--- if we use the implements 'Runnable', we need to create object of Thread;
            myThread.start();                   // the 'start' for 'Runnable';

            myThread.join(); // 'join' is for a separation between each execution; we needed
            // 'try and catch' or the 'throws InterruptedExeption' in the method;
        }

	/*	Multi multi1 = new Multi ();
		Multi multi2 = new Multi ();

		multi1.start(); // method 'start' involves all the subjects affiliated with Multi class, i.e. 'run' method at ones.
		multi2.start(); */

    }
}
