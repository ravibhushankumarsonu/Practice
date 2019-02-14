package multithreading;

/**
 * created by ravibhushan.k on 26/01/19
 */

class NewThread1 implements Runnable {
    String threadName;
    Thread t;
    NewThread1(String threadName) {
        this.threadName = threadName;
        t = new Thread(this, threadName);
        System.out.println("New Thread " + threadName);
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i=5; i>=0; i--) {
                System.out.println(threadName + " "+ i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName +" is Interrupted.");
        }
        System.out.println(threadName + " Exiting.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread1("one");
        new NewThread1("two");
        new NewThread1("three");

        try {
            Thread.sleep(10000);
            System.out.println("Main thread Exit");
        } catch (InterruptedException e) {
            System.out.println("Main Thread is Interrupted.");
        }
    }
}
