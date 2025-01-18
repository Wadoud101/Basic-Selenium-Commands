package a05_JUnitFramework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_JUnitNotatio {

    WebDriver driver;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test01(){
        driver.get("https://bestbuy.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test2(){
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test3(){
        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
