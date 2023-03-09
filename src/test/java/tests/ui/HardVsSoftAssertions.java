package tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HardVsSoftAssertions {

    @Test
    public void test_3(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        // Hard Assertions

//        Assert.assertEquals(driver.getCurrentUrl(), "dvsjkbdvb");
//        Assert.assertNotEquals(driver.getTitle(), "Web Orders");
//        Assert.assertTrue(driver.getPageSource().contains("vfdhfvd"));

        //Soft Assertions

        SoftAssert softAssert = new SoftAssert();  //Create the object of SoftAssert class

        softAssert.assertEquals(driver.getCurrentUrl(), "dvsjkbdvb"); //call the methods with the object
        softAssert.assertNotEquals(driver.getTitle(), "Web Orders");
        softAssert.assertTrue(driver.getPageSource().contains("vfdhfvd"));
        driver.quit();

        softAssert.assertAll(); // The last step is important, without this method call soft assertions will not throw any exception if there were any

        // The common scenario where soft assertions are needed is when you have multiple assertions in a single test case

    }
}
