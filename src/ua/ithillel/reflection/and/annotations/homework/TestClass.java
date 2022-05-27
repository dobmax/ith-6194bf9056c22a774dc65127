package ua.ithillel.reflection.and.annotations.homework;

public class TestClass {

    @BeforeSuite
    void setUp() {
        System.out.println("Set up");
    }

    @AfterSuite
    void tearDown() {
        System.out.println("Tear down");
    }

    @Test
    void method1() {
        System.out.println("Test 1");
    }

    @Test(order = 2)
    void method2() {
        System.out.println("Test 2");
    }

    @Test(order = 4)
    void method3() {
        System.out.println("Test 4");
    }

    @Test(order = 3)
    void method4() {
        System.out.println("Test 3");
    }

}
