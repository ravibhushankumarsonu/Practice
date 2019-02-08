package multithreading;

/**
 * created by ravibhushan.k on 26/01/19
 */
class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Interrupted when getting the value.");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void set(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Interrupted when putting the value.");
            }
        }

        System.out.println("Set: " + n);
        this.n = n;
        valueSet = true;
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        try{
            while (true) {
                q.set(i++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted in Producer.");
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Ctr+c to stop.");
    }
}
