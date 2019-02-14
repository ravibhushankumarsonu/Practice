package personal.testing.normal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by ravibhushan.k on 26/01/19
 */
public class MainFunctionTestingTest {

    @Test
    public void main() {
        String[] args = new String[]{"ravi", "mohan"};
        MainFunctionTesting.main(args);
    }

}