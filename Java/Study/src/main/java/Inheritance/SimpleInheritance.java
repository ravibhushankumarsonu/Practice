package Inheritance;

/**
 * created by ravibhushan.k on 06/12/18
 */

//Create a superClass
    class A {
        int i, j;
        void showij() {
            System.out.println("i and j are : " + i + " "+ j);
        }
}

//Create a subclass by extending class A
class B extends A {
        int k;
        void showk() {
            System.out.println("k is "+k);
        }

        void sum() {
            System.out.println("Sum of i+j+k : "+(i+j+k));
        }
}

public class SimpleInheritance {
        public static void main(String[] args) {
            A superObj = new A();
            B subObj = new B();

            superObj.i = 10;
            superObj.j = 20;
            System.out.println("Content of superObject");
            superObj.showij();

            /*Subclass has access to the all public member of the super class*/
            subObj.i = 12;
            subObj.j = 23;
            subObj.k = 24;
            System.out.println("Content of Sub object: ");
            subObj.showk();
            subObj.showij();
            subObj.sum();

        }
}
