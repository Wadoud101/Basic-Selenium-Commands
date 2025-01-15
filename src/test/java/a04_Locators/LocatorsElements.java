package a04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsElements {
    public static void main(String[] args) {

        // 1. tag    2. Attribute   3. Value    Locate UNIQUE attribute or vlue
        //Locators: 1.id  2.name   3.className   4.tagName   5.linkText   6.partialLinkText   7.cssSelector   8.xpath
        // xpath:   //tagName[@attributeName='attributeValue']
        //          (//tagName[@attributeName='attributeValue'])[2]


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone");
        searchBox.submit();

        WebElement text = driver.findElement(By.xpath("//div[@id='swml']"));
        System.out.println("*******************");
        System.out.println(text.getText());
        System.out.println("*******************");

        driver.quit();


    }
}
