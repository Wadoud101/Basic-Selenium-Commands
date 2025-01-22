package a05_JUnitFramework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_JUnitAssertion {

    WebDriver driver;

    @Before
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01(){

        driver.get("http://facebook.com");

        WebElement search = driver.findElement(By.id("email"));
        search.sendKeys("Nutella@yahoo.com");
        search.submit();

        WebElement button = driver.findElement(By.xpath("//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft']"));
        System.out.println(button.getText());
        String button2 = button.getText();
        String expected = "Cintinue";
        Assert.assertEquals(button2, expected);


    }

   // @After
    public void tearDown(){
        driver.quit();
    }
}
