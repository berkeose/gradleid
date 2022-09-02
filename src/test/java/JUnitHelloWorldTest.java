/*import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;*/
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class JUnitHelloWorldTest {
   /* @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }*/
/*
    @Before
    public void before() {
        System.out.println("Before Test Case");
    }*/

    @Test
    public void isGreaterTest() {
        System.out.println("Test");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        Assertions.assertTrue(helloWorld.isGreater(4, 3), "Num 1 is greater than Num 2");
    }
/*
    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    */

}
