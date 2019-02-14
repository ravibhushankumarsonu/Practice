package chapter12.enumerations.enums;

/**
 * created by ravibhushan.k on 27/01/19
 */
public enum Apple {
    Apple1(10), Apple2(9), Apple3(11), Apple4(12), Apple5(30);
    private int price;
    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
