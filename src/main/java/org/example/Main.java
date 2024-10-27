package org.example;
import org.apache.http.util.Asserts;
import org.example.Classes.AddToCart;
import org.example.Classes.Login;
import org.example.Classes.Search;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\radmahmoud\\Downloads\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");//      WebDriver driver= new ChromeDriver();

         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://www.amazon.com/gp/css/homepage.html/ref=nav_bb_ya");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Login o1= new Login(driver);
        o1.SignIn();
        Thread.sleep(5000);
        Search o2= new Search(driver);
        o2.Search();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        AddToCart o3=new AddToCart(driver);
        o3.CheckOut();

//        driver.quit();
    }

}





