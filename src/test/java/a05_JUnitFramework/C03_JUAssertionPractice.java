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

public class C03_JUAssertionPractice {

    WebDriver driver;

    @Before
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01(){

        driver.get("http://automationexercise.com");

        WebElement logoElement = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElement.isDisplayed());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement signUp = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        signUp.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement loginText = driver.findElement(By.xpath("//h2[@class='or']"));
        Assert.assertTrue(loginText.isDisplayed());

        WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        email.sendKeys("ahmetjan@nehaber.com");

        WebElement pass = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        pass.sendKeys("123456");

        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        WebElement text = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        System.out.println(text.getText());
        Assert.assertTrue(text.isDisplayed());


    }

    //@After
    public void tearDown(){
        driver.quit();
    }


}
