import org.junit.*;

public class JUnitIntroduction {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Execute before class...");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Execute after class...");
    }
    @Before
    public void setUp() {
        System.out.println("Executed before....");
    }
    @After
    public void tearDown() {
        System.out.println("Executed after....");
    }
    @Test
    public void test1() {
        System.out.println("Executed test1....");
    }
    @Test
    public void test2() {
        System.out.println("Executed test2...");
    }
}
