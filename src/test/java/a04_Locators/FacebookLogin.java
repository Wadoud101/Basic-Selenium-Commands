package a04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://facebook.com");
        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
        emailBox.sendKeys("testers@yahoo.com");


        WebElement passBox = driver.findElement(By.xpath("//input[@name='pass']"));
        passBox.sendKeys("testers1234");
        // passBox.submit();

        driver.quit();
    }
}
