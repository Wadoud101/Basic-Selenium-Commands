package a07_TestNG.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(String browser){
        if(driver == null){
            switch (browser){
                case "chrome" :
                    driver = new ChromeDriver();
                    break;

                case "safari" :
                    driver = new SafariDriver();
                    break;
                case "explorer" :
                    driver = new EdgeDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        return driver;
    }
}
