package tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataDrivenTesting {


    //Data -driven testing -> same test method can be run multiple times with different datasets

//    @Test
//    public void testSearch(){
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://www.google.com/");
//
//        driver.findElement(By.name("q")).sendKeys("apple watch", Keys.ENTER);
//
//        Assert.assertTrue(driver.getTitle().contains("apple watch"));
//
//
//        driver.quit();
//
//    }
//
//    @Test
//    public void testSearch2(){
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://www.google.com/");
//
//        driver.findElement(By.name("q")).sendKeys("幸福", Keys.ENTER);
//
//        Assert.assertTrue(driver.getTitle().contains("幸福"));
//
//
//        driver.quit();
//
//    }


    @Test (dataProvider = "getData")
    public void testSearch(String searchTerm){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys(searchTerm, Keys.ENTER);

        Assert.assertTrue(driver.getTitle().contains(searchTerm));


        driver.quit();

    }

    @DataProvider
    public Object[][] getData(){

        return new Object[][] {
                {"chicken"},
                {"幸福"},
                {"チャラ男とは言動が軽いさまを表す"},
                {"ฃ ขวด"},
                {"rqnajcadwjttodffsputngqsyuqkuimpwcgxwrjhrvzsozxzonyoaocsmpyobfjjzdadgulgtnlfggymrfxrwyxgtsogfruuinsnkxnyxgbigphqeiowgjgihdalpmoijwwoaxozmoxkvmoqatukriofyvpbeuhevgiuvpyktcwrneyavlzcepniebpjphxaguuujkdnkeynygdydfushxuhvrpyztloatvcejcizxzqxkegipvpnckdvobhcqvklxumiactpprprpjtsrypxjkxxauesatczsmzja"},
                {"fxhokmkakfmhhptbhibymzycjkpbflgeqmfewdmnfhouvfudjjdzksfrnogusvtkehgfhibxvzezoqdjdburpnlrfwtsyacbtbnndgizspckrjqtudawjvoehpkipfmflpvkvtcuyldkvjqkypjxxrgzktnhjqvfdjorebesiyvptxvbdnaazvdnkwuwzstbgytummsguzsujsqmnmvwhyfaraukppjeexwxfwvclbhyqyzuuwhizfhnbrikydnonzgajvzzfnmfdancitzfdxapagrbwzqyxjomdabgwvqzfxhokmkakfmhhptbhibymzycjkpbflgeqmfewdmnfhouvfudjjdzksfrnogusvtkehgfhibxvzezoqdjdburpnlrfwtsyacbtbnndgizspckrjqtudawjvoehpkipfmflpvkvtcuyldkvjqkypjxxrgzktnhjqvfdjorebesiyvptxvbdnaazvdnkwuwzstbgytummsguzsujsqmnmvwhyfaraukppjeexwxfwvclbhyqyzuuwhizfhnbrikydnonzgajvzzfnmfdancitzfdxapagrbwzqyxjomdabgwvqzfxhokmkakfmhhptbhibymzycjkpbflgeqmfewdmnfhouvfudjjdzksfrnogusvtkehgfhibxvzezoqdjdburpnlrfwtsyacbtbnndgizspckrjqtudawjvoehpkipfmflpvkvtcuyldkvjqkypjxxrgzktnhjqvfdjorebesiyvptxvbdnaazvdnkwuwzstbgytummsguzsujsqmnmvwhyfaraukppjeexwxfwvclbhyqyzuuwhizfhnbrikydnonzgajvzzfnmfdancitzfdxapagrbwzqyxjomdabgwvqzfxhokmkakfmhhptbhibymzycjkpbflgeqmfewdmnfhouvfudjjdzksfrnogusvtkehgfhibxvzezoqdjdburpnlrfwtsyacbtbnndgizspckrjqtudawjvoehpkipfmflpvkvtcuyldkvjqkypjxxrgzktnhjqvfdjorebesiyvptxvbdnaazvdnkwuwzstbgytummsguzsujsqmnmvwhyfaraukppjeexwxfwvclbhyqyzuuwhizfhnbrikydnonzgajvzzfnmfdancitzfdxapagrbwzqyxjomdabgwvqz"}

        };

    }

}
