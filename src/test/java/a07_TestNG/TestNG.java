package a07_TestNG;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.*;

import java.util.PriorityQueue;

public class TestNG {

    @BeforeSuite
    public void beforeSuite(){  System.out.println("Before Suite");  }
    @AfterSuite
    public void afterSuite(){  System.out.println("After Suite");  }

    @BeforeMethod
    public void beforeMethod(){  System.out.println("Before Method");}
    @AfterMethod
    public void afterMethod(){ System.out.println("After Method");  }

    @BeforeTest
    public void beforeTest(){ System.out.println("Before Test"); }
    @AfterTest
    public void afterTest(){ System.out.println("After Test"); }

    @BeforeClass
    public void beforeClass(){ System.out.println("Before Class"); }
    @AfterClass
    public void afterClass(){ System.out.println("After Class"); }

    @Test (priority = 5)
    public void test01(){ System.out.println("Test 1"); }
    @Test (priority = -5)
    public void test02(){ System.out.println("Test 2"); }
    @Test
    public void test03(){ System.out.println("Test 3"); }


}
