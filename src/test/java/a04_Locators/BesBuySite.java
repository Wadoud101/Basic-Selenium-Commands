package a04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class BesBuySite {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://bestbuy.com");

        List<WebElement> buttons =  driver.findElements(By.tagName("button"));
        System.out.println(buttons.size());

        System.out.println("****************");
        for (WebElement each: buttons){
            System.out.println(each.getText());
        }

        driver.quit();
    }
}
