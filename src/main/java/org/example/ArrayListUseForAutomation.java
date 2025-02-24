package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;




public class ArrayListUseForAutomation {

    public void storeAndShowAllLink(WebDriver D){
        D.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = D.findElements(By.tagName("a"));

        ArrayList<String> LT = new ArrayList<>();  //(LT means Link Text)


       ArrayList<String> URLs = new ArrayList<>();



        for(WebElement LinksStore:links){

            String LinkText = LinksStore.getText().trim();

            String UrlText = LinksStore.getAttribute("href");

            if(!LinkText.isEmpty()){
                LT.add(LinkText);

                URLs.add(UrlText);
            }
        }

        for(String PrintLinkTexts:LT){
            System.out.println("Prints linkText is:"+PrintLinkTexts);
        }
        for(String PrintUrlTexts:URLs){
            System.out.println("Prints UrlText is:"+PrintUrlTexts);
        }


       // driver.quit();
          D.quit();


    }
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        ArrayListUseForAutomation joy = new ArrayListUseForAutomation();
        joy.storeAndShowAllLink(driver);
    }
}
