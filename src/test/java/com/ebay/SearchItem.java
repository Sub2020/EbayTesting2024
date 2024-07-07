package com.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchItem {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\Ebay_complete_testing\\src\\driver\\edge\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();

        WebElement results = driver.findElement(By.className("srp-controls__count-heading"));
        if (results.isDisplayed()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");


        }
        driver.quit();
    }
}



