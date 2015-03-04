package org.seleniumqa.lesson_6;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {

    WebDriver driver = new FirefoxDriver();

    //Preconditions
    @BeforeClass
    public void setUp() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //ATTN! Has influence on clickability of elements
        driver.manage().window().maximize();

        driver.get("https://www.google.com.ua");
    }

    @Test
    public void searchTest() {

        //Find search field on the page by id
        WebElement searchField = driver.findElement(By.id("lst-ib"));

        //enter "selenium" into the field
        searchField.sendKeys("Selenium");

        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/li[1]/div/h3/a"));

        Assert.assertEquals(seleniumLink.getText().toString().contains("Selenium"),true);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
