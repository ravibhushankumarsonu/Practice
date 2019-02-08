package Chapter14;

/**
 * created by ravibhushan.k on 28/01/19
 */
public class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
