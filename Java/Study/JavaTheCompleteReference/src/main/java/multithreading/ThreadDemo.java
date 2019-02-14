package multithreading;

/**
 * created by ravibhushan.k on 26/01/19
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try {
            for(int i=5; i>=0; i--) {
                System.out.println("Master is " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Master is interrupted " + e.getMessage());
        }
    }
}
