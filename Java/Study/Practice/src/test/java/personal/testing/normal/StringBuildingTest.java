package personal.testing.normal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by ravibhushan.k on 01/02/19
 */
public class StringBuildingTest {

    @Test
    public void getEventKeyTest() {
        StringBuilding stringBuilding = new StringBuilding();
        String event = "event";
        String baseKey = "baseKey/dadsa/asdfasd/asdfa";
        String ans = stringBuilding.getEventKey(event, baseKey);
        System.out.println(ans);
    }

}