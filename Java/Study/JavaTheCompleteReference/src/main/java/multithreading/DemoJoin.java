package multithreading;

/**
 * created by ravibhushan.k on 26/01/19
 */
public class DemoJoin {
    public static void main(String[] args) {
        NewThread1 ob1 = new NewThread1("one");
        NewThread1 ob2 = new NewThread1("two");
        NewThread1 ob3 = new NewThread1("three");

        System.out.println("Thread One is alive "+ ob1.t.isAlive());
        System.out.println("Thread Two is alive "+ ob2.t.isAlive());
        System.out.println("Thread Three is alive "+ ob3.t.isAlive());

        //Waiting to finish the threads.
        try {
            System.out.println("Waiting to finish the Thread.");
            ob3.t.join(); //Wait till thread 3 finished
            ob2.t.join();
            ob1.t.join(); // Waith till thread 1 finished.
        } catch (InterruptedException e) {
            System.out.println("Main Thread is Interrupted.");
        }

        System.out.println("Thread One is alive "+ ob1.t.isAlive());
        System.out.println("Thread Two is alive "+ ob2.t.isAlive());
        System.out.println("Thread Three is alive "+ ob3.t.isAlive());
    }
}
