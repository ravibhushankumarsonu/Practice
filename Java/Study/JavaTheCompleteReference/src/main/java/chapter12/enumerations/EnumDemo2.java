package chapter12.enumerations;

import chapter12.enumerations.enums.Apple;

/**
 * created by ravibhushan.k on 27/01/19
 */
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Price of apple1 is " + Apple.Apple1.getPrice());

        System.out.println("All Apple Price are :");
        for(Apple a : Apple.values()) {
            System.out.println(a + "Price is "+ a.getPrice());
        }
    }
}
