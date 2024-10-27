package org.example.Classes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Search {
    WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
    }

    public  void Search(){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement result=driver.findElement(By.xpath("/html/body/div[1]/div[1]/span/div/h1/div/div[1]/div/div/span[3]"));
        String Laptop=result.getText();
        String Expected="\"laptop\"";
        Assert.assertEquals(Expected,Laptop);
//        if (Laptop.equals(Expected) ){
//            System.out.println("passed");
//
//        }
//        else {
//            System.out.println("failed");
//        }
//        System.out.println(Laptop);
//        System.out.println(Expected);



    }
}
