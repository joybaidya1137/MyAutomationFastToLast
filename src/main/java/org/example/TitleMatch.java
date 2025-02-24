package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleMatch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.oracle.com/bd/java/technologies/downloads/");
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Java Downloads | Oracle Bangladesh";
        boolean TitleMatch = ActualTitle.equals(ExpectedTitle);

        System.out.println("ActualTitle:" +ActualTitle);
        System.out.println("ExpectedTitle:" +ExpectedTitle);
        System.out.println("TitleMatch:" +TitleMatch);

        driver.close();
    }



}
