package tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataDrivenTesting2 {

    @Test(dataProvider = "anotherSetOfData")
    public void testSearch(String userName,
                           String nameF,
                           String nameL,
                           String email,
                           String password){

        WebDriver wb = new ChromeDriver();
        wb.manage().window().maximize();
        wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wb.navigate().to("http://duotify.us-east-2.elasticbeanstalk.com/register.php");
        Assert.assertEquals(wb.getTitle(),"Welcome to Duotify!","title Wrong");
        wb.findElement(By.id("hideLogin")).click();
        wb.findElement(By.id("username")).sendKeys(userName);
        wb.findElement(By.id("firstName")).sendKeys(nameF);
        wb.findElement(By.id("lastName")).sendKeys(nameL);
        wb.findElement(By.id("email")).sendKeys(email);
        wb.findElement(By.id("email2")).sendKeys(email);
        wb.findElement(By.id("password")).sendKeys(password);
        wb.findElement(By.id("password2")).sendKeys(password);
        wb.findElement(By.name("registerButton")).click();

        wb.quit();

    }


    @DataProvider
    public Object[][] provideData(){
        return new Object[][]{
                {"scscsdsd", "Max", "Fdsfagj", "dsvg@gmail.com", "cdsgcdghsd"},
                {"dscdscdscdsdcdscddscghvd", "63784", "324324", "ddghcvsdgvchgdsvhsc@gmail.com", "cjhdvsdg"},
                {"dscdscdscdsdcdscddscghvd", "63784", "324324", "ddghcvsdgvchgdsvhsc@gmail.com", "cjhdvsdg"}
        };
    }


    @DataProvider
    public Object[][] anotherSetOfData(){
        return Utility.readFromCSV("dataFor.csv");
    }

}
