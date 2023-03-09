package tests.db;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllOrders extends TestBase{




    @Test
    public void testDeleteAllButton(){

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
        driver.findElement(By.name("ctl00$MainContent$btnDelete")).click();

        Assert.assertTrue(driver.getPageSource().contains("List of orders is empty."));
    }
}
