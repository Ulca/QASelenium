package org.seleniumqa.lesson_6;

import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class StylusSearchTest {

    WebDriver driver = new FirefoxDriver();

    @BeforeClass
    public void setUp() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //ATTN! Has influence on clickability of elements
        driver.manage().window().maximize();

        driver.get("http://stylus.com.ua");

    }

    @Test
    public void sonyTest() {

        WebElement searchField = driver.findElement(By.id("search_text"));

        searchField.sendKeys("Sony");

        WebElement searchButton = driver.findElement(By.id("button"));

        searchButton.click();

        WebElement firstSonyLink = driver.findElement(By.xpath(".//*[@id='col1_content']/table[2]/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/h4/a"));

        Assert.assertTrue(firstSonyLink.getText().contains("Sony"));

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
