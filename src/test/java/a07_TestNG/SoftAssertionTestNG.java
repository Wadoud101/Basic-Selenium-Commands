package a07_TestNG;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class SoftAssertionTestNG {

    WebDriver driver;
    @Test
    public void testSoftAssert() throws InterruptedException {
      //  Test Case 8: Verify All Products and product detail page USING SoftAssurtion


      //  1. Launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     //   2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
     //   3. Verify that home page is visible successfully
        String expUrl = "https://automationexercise.com/";
        String actUrl = driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(expUrl, actUrl,"URL");
    //    4. Click on 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();

    //    5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProduct = driver.findElement(By.xpath("//*[text()='All Products']"));
        softAssert.assertTrue(allProduct.isDisplayed(),"Visibility of All Product");
    //    6. The products list is visible
        List<WebElement> products = driver.findElements(By.xpath("//*[text()='View Product']"));
        softAssert.assertTrue(!products.isEmpty(),"Number of Product");
     //   7. Click on 'View Product' of first product
         WebElement button = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        button.click();
     //   8. User is landed to product detail page
        String expUrl2 = "https://automationexercise.com/product_details/1";
        String actUrl2 = driver.getCurrentUrl();
        softAssert.assertEquals(expUrl2, actUrl2,"Product Page");
     //   9. Verify that detail is visible: product name, category, price, availability, condition, brand
        WebElement poloProduct = driver.findElement(By.xpath("//*[text()=' Polo']"));
        softAssert.assertTrue(poloProduct.isDisplayed(),"Polo Cloth Select");


        driver.quit();
        softAssert.assertAll();
    }
}
