package personal.development;


import graphs.Graphs1;

/**
 * created by ravibhushan.k on 26/01/19
 */
public class CallingFromOtherModule {
    String name;
    Graphs1 graphs1;
    //I am able to import from other module by adding the dependencies like this.
    /*
     <dependency>
            <groupId>Study</groupId>
            <artifactId>geeks_for_geeks</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>compile</scope>
       </dependency>*/


    /**
     * With this approach I am not able to build the project. I am getting error that parent artifact is not found.
     * Although it doesn't work at the first place due to the your maven is expecting a jar but nothing is present here.
     * I should run the mvn clean on the root project. After that it works fine.
     */

}
