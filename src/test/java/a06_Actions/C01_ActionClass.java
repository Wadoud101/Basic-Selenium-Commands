package a06_Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C01_ActionClass {

    WebDriver driver;
    Actions actions;

    //@Test
    public void actionClass(){
        driver = new ChromeDriver() {
        };
        driver.manage().window().maximize();
        driver.get("http://automationexercise.com");

        WebElement signUpElement = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        actions.click(signUpElement).perform();
    }
}
