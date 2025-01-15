package a01_GetMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        System.out.println("**********************************");
        driver.get("http://facebook.com");
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Page URL: " + driver.getCurrentUrl());
        System.out.println("Windows hash code: " + driver.getWindowHandle());
        System.out.println("All windows hash codes: " + driver.getWindowHandles());

        // driver.getPageSource();   in open windows: (ctrl+u)

        driver.close();

    }
}
