package tests.db;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends TestBase {



    @Test
    public void testLogin(){



        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        Assert.assertEquals(driver.getTitle(), "Web Orders");


    }

    @Test
    public void testLogin2(){


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("");
        driver.findElement(By.className("button")).click();
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");


    }

    // flaky test -> usually a UI test that does not give a stable result
    // main reason for flakiness-> synchronization and waits
    @Test (groups = {"smoke", "login", "flaky"})
    public void testLogin3(){



        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");


    }

    @Test
    public void testLogin4(){



        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("Test");
        driver.findElement(By.className("button")).click();
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");

    }
}
