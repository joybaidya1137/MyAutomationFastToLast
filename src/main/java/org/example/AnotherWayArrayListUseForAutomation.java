package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AnotherWayArrayListUseForAutomation {
    public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.w3schools.com/");
     driver.manage().window().maximize();

     List<WebElement> AllLink = driver.findElements(By.tagName("a"));
     List<String> LinkText = new ArrayList<>();
     List<String> UrlsText =new ArrayList<>();



     for(WebElement AllLinkStore : AllLink){

         String LT = AllLinkStore.getText().trim();
         if(!LT.isEmpty()){
             LinkText.add(LT);
         }

         String UT = AllLinkStore.getAttribute("href");
         if (!UT.isEmpty()){
             UrlsText.add(UT);

         }

     }

        System.out.println("Now DisplayResult LinkText :");


        System.out.println("StringText Number is : "+LinkText.size());
        for(int i=0; i<LinkText.size();i++){
         System.out.println(i+" Number String Text is :"+LinkText.get(i));
         }


        System.out.println("Now DisplayResult UrlText");
        System.out.println("UrlsText Number is :" +UrlsText.size());

       /*  //1 way
        for(int j=0; j<UrlsText.size(); j++){
            System.out.println(j+" Number UrlsText is :" +UrlsText.get(j));
        }


     //2 ways
        for(String PrintUrlTexts:UrlsText) {
            System.out.println("Prints UrlText is:" + PrintUrlTexts);
            }*/
//3 ways
        int index = 0;
        for (String PrintUrlTexts : UrlsText) {
            System.out.println(index + " Number UrlText is: " + PrintUrlTexts);
            index++;
        }

        driver.close();

    }
}
