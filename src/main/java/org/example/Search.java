package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("kobita song jems");
        search.submit();
        Thread.sleep(2000);
        driver.close();


    }
}
