package org.example.Classes;

import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login   {
    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    public void SignIn() throws InterruptedException {
    //user click to sign in button
    driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
    //user enter mobile number
    driver.findElement(By.id("ap_email")).sendKeys("01145526607");
    //user click on contine
    driver.findElement(By.id("continue")).click();
    //User enter password
    driver.findElement(By.id("ap_password")).sendKeys("112233Ayz@");
    //Click on sign in button
    driver.findElement(By.id("signInSubmit")).click();
    driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/form/div[7]/span/span/input")).click();
        WebElement Text=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
      String ActualMessage= Text.getText();
        String Message= "Hello, Radwa";
//        if (Message.equals(ActualMessage) ){
//            System.out.println("passed");
//
//        }
//        else {
//            System.out.println("failed");
//        }
        Assert.assertEquals(Message,ActualMessage);

    }


}
