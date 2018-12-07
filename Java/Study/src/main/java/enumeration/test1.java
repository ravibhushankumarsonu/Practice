package enumeration;

/**
 * created by ravibhushan.k on 06/12/18
 */

enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class test1 {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println(ap);
        System.out.println("Reading every value of an enumeration");
        for (Apple ap1 : Apple.values()) {
            System.out.println(ap1);
        }
    }
}
