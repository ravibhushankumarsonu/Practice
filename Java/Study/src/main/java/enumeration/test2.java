package enumeration;

/**
 * created by ravibhushan.k on 06/12/18
 */

enum Mango {
    Jonathan(10),
    Mohan(23),
    Ramesh(34),
    Khali(30);

    private int quantity;
    Mango(int i) {
        quantity = i;
    }

    int getQuantity() {
        return quantity;
    }
}
public class test2 {
    public static void main(String[] args) {
        for (Mango mg : Mango.values()) {
            System.out.println(mg.name() + " " + mg.getQuantity());
        }
    }
}
