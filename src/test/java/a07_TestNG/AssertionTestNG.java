package a07_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AssertionTestNG {
    public static void main(String[] args) {

//        Test Case 8: Verify All Products and product detail page

//        1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
//        3. Verify that home page is visible successfully
        String expUrl = "https://automationexercise.com/";
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals(expUrl, actUrl);
//        4. Click on 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();

//        5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProduct = driver.findElement(By.xpath("//*[text()='All Products']"));
        Assert.assertTrue(allProduct.isDisplayed());
//        6. The products list is visible
        List<WebElement> products = driver.findElements(By.xpath("//*[text()='View Product']"));
        Assert.assertTrue(products.size() > 0);
//        7. Click on 'View Product' of first product
        driver.findElement(By.xpath("(//*[text()='View Product'])[1]")).click();
//        8. User is landed to product detail page
        String expUrl2 = "https://automationexercise.com/product_details/1";
        String actUrl2 = driver.getCurrentUrl();
        Assert.assertEquals(expUrl2, actUrl2);
//        9. Verify that detail is visible: product name, category, price, availability, condition, brand
        WebElement poloProduct = driver.findElement(By.xpath("//*[text()=' Polo']"));
        Assert.assertTrue(poloProduct.isDisplayed());

        driver.quit();
    }
}
