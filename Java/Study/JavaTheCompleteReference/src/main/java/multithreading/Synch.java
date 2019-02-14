package multithreading;

/**
 * created by ravibhushan.k on 26/01/19
 */

class Callme {
     void call(String msg) {
        System.out.print("[ " +msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Thread id Interrupted.");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme target, String msg) {
        this.msg = msg;
        this.target = target;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
        //target.call(msg);
    }
}

public class Synch {
    public static void main(String[] args) {
        Callme callme = new Callme();
        Caller ob1 = new Caller(callme, "Hello");
        Caller ob2 = new Caller(callme, "Synchronized");
        Caller ob3 = new Caller(callme, "World");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is Interrupted.");
        }
    }
}
