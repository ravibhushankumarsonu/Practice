package Inheritance;

/**
 * created by ravibhushan.k on 06/12/18
 */

abstract class A1 {
    abstract void callme();

    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B1 extends A1 {
    void callme() {
        System.out.println("B's implemenattion of callme.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B1 b = new B1();
        b.callme();
        b.callmetoo();
    }
}
