package tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import tests.db.TestBase;

import java.time.Duration;

public class LoginTests2 extends TestBase {




    @Test (groups = {"flaky"})
    public void testLogin4(){

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("");
        driver.findElement(By.className("button")).click();
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");


    }

    @Test
    public void testLogin(){

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        Assert.assertEquals(driver.getTitle(), "Web Ordersvdshsd");


    }

    @Test (groups = {"smoke"})
    public void testLogin2(){

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("");
        driver.findElement(By.className("button")).click();
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");


    }

    @Test
    public void testLogin3(){

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");


    }


}
