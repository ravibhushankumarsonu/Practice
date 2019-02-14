package chapter12.enumerations;

import chapter12.enumerations.enums.Apple;

/**
 * created by ravibhushan.k on 27/01/19
 */
public class EnumDemo1 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Here are the all apple contains");

        Apple apple[] = Apple.values();
        for (Apple a : apple) {
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Apple1");
        System.out.println("ap contains " + ap);

        System.out.println("Another approach for this");
        for(Apple a : Apple.values()) {
            System.out.println(a);
        }
    }
}
