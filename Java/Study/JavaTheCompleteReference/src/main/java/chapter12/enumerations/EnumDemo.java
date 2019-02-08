package chapter12.enumerations;

import chapter12.enumerations.enums.Apple;

/**
 * created by ravibhushan.k on 27/01/19
 */
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.Apple1;
        System.out.println("value of ap is " + ap);
        System.out.println();

        switch (ap) {
            case Apple1:
                System.out.println("Apple of first Type.");
                break;
            case Apple2:
                System.out.println("Apple of second Type.");
                break;
            case Apple3:
                System.out.println("Apple of third Type.");
                break;
            case Apple4:
                System.out.println("Apple of fourth Type.");
                break;
            default:
                System.out.println("Default apple type");
                break;
        }
    }
}
