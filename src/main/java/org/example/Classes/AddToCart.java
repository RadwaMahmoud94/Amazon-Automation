package org.example.Classes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {
    WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    public void CheckOut() throws InterruptedException {
        Actions actions=new Actions(driver);

    WebElement ChoosenLaptop=driver.findElement(By.id("a-autoid-9-announce"));
    actions.moveToElement(ChoosenLaptop);
    Thread.sleep(2000);
    ChoosenLaptop.click();
    //user click on add to cart button
    Thread.sleep(1000);
    driver.findElement(By.id("nav-cart")).click();
    //user click on check to proceed
    Thread.sleep(3500);
    driver.findElement(By.id("sc-buy-box-ptc-button")).click();
    //user want to change address and add new one
    Thread.sleep(3500);
    driver.findElement(By.id("addressChangeLinkId")).click();
    //user click on add new address button to add new one
    driver.findElement(By.id("add-new-address-popover-link")).click();
    Thread.sleep(3500);
    //user enter country
    driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/form/div/div[7]/div/div[2]/span/span/span/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("address-ui-widgets-countryCode-dropdown-nativeId_65")).click();
        Thread.sleep(2000);
        //User enter full name
        driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Radwa");
        Thread.sleep(2000);
        //user enter mobile number
        driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("1145526607");
        Thread.sleep(2000);
        //user enter full address
        driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("Maadi cornish elnile");
        Thread.sleep(2000);
        //user enter building number
        driver.findElement(By.id("address-ui-widgets-enter-building-name-or-number")).sendKeys("87");
        Thread.sleep(2000);
        //usesr enter city
        driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Maadi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/form/div/div[7]/div/div[12]/ul/li[1]")).click();
        Thread.sleep(2000);
        //user choose district
        WebElement District=driver.findElement(By.id("address-ui-widgets-enterAddressDistrictOrCounty"));
        actions.moveToElement(District);
        District.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/form/div/div[7]/div/div[14]/ul/li[8]")).click();
//        Thread.sleep(2000);
        //user click on use this address button
        driver.findElement(By.id("address-ui-widgets-form-submit-button")).click();
        Thread.sleep(2000);
        //user want to make sure that address save completely
        WebElement ActualName=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/ul/li[1]"));

        String Result=ActualName.getText();
        String ExpectedName="Radwa";


//        System.out.println(ExpectedName);
//        System.out.println(Result);
        if (ExpectedName.equals(Result) ){
            System.out.println("passed");

        }
        else {
            System.out.println("failed");
        }
        Assert.assertEquals(ExpectedName,Result);

    }
}
