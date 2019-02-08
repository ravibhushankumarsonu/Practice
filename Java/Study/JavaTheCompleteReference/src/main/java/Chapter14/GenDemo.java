package Chapter14;

/**
 * created by ravibhushan.k on 28/01/19
 */
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;

        iob = new Gen<Integer>(10);
        iob.showType();

        int v = iob.getOb();

        System.out.println("Value :" + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Name");

        strOb.showType();

        String val = strOb.getOb();
        System.out.println("Value :" + val);
    }
}
