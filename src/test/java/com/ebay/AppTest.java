package com.ebay;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AppTest {

    private WebDriver driver;

    @Before

    public void setup(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\Ebay_complete_testing\\src\\driver\\edge\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test

    public void testEbayTitle(){
        driver.get("https://www.ebay.com/");
        String title = driver.getTitle();
        System.out.println(title);
        assertTrue("Title should contain 'Electronics, Cars, Fashion, Collectibles & More | eBay'", title.contains(("Electronics, Cars, Fashion, Collectibles & More | eBay")));

    }

}
