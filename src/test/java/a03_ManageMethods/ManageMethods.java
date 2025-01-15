package a03_ManageMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        System.out.println("Windows Size: " + driver.manage().window().getSize());
        System.out.println("Windows Position: " + driver.manage().window().getPosition()); // acording to left down corner

        System.out.println("**********************************");
        driver.manage().window().setSize(new Dimension(800,600));
        driver.manage().window().setPosition(new Point(100,100));

        System.out.println("new Windows Size: " + driver.manage().window().getSize());
        System.out.println("new Windows Position: " + driver.manage().window().getPosition());
        System.out.println("**********************************");

        driver.manage().window().maximize();
        System.out.println("Maximized windows size: " + driver.manage().window().getSize());
        System.out.println("Maximized windows position: " + driver.manage().window().getPosition());
        System.out.println("**********************************");

        driver.manage().window().fullscreen();
        System.out.println("Fullscreen windows size: " + driver.manage().window().getSize());
        System.out.println("Fullscreen windows position: " + driver.manage().window().getPosition());
        System.out.println("**********************************");

        driver.manage().window().minimize();
        System.out.println("Minimized windows size: " + driver.manage().window().getSize());
        System.out.println("Minimized windows position: " + driver.manage().window().getPosition());
        System.out.println("**********************************");

        driver.manage().window().maximize();

        driver.quit();


    }
}
