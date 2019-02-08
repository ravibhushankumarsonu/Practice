package multithreading;

/**
 * created by ravibhushan.k on 26/01/19
 */
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Passing this as the first argument indicates that you want the new thread to call the run( )
        // method on this object
        t = new Thread(this, "Demo Thread");
        System.out.println("child thread "+ t);
        // start( ) is called, which starts the thread of execution beginning at the run( ) method.
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i=5; i>=0; i--) {
                System.out.println("Child Thread "+ i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child is Interrupted " + e.getMessage());
        }
    }
}
