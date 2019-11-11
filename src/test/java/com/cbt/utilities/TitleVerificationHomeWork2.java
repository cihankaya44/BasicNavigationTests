package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerificationHomeWork2 {
    /*
    Tests: Title and URLtest
    1.Create a new class TitleVerification under utilitiespackageand create a main method.
    2.Add this ArrayList declaration to the main method: List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
    3.Open chrome browser
    4.Visit all the websitesfrom step 3and verify that they all have the same title.
    5.Verify that all URLsof all pages start with http://practice.cybertekschool.com.
    6.Close the browser at the end of the test.
    Tests: Title and URLtest 2
    1.Create a new class TitleVerification2under utilities packageand create a main method.
    2.Add this ArrayList declaration to the main method: List<String> urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com/", "https://walmart.com, "https://westelm.com/");
    3.Visit all websites one by one.
    4.Verify that URLof the website contains the title of the website.Ignore spacesand casein comparison. For example,title of in the first websitetitle is Lulu and Giorgiaand the URLis https://lulugandgeorgia.com. So,this test case must pass.
    5.Close the browser at theendof the test.Tests: Title and URL
    test 3
    1.Create a new class TitleVerification3under utilities package and create a main method.
    2.Do the same test case as in the previousexercise, except this time open and close a new browser for each web site.
     */
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/" , "https://www.wayfair.com/" ,
                "https://www.walmart.com/" , "https://www.westelm.com/");
        for(int i = 0 ; i < urls.size(); i++){
            driver.get(urls.get(i));
            String title = driver.getTitle().toLowerCase().replaceAll(" " , "");
            int firstIndex = urls.get(i).indexOf("www.");
            int lastIndex = urls.get(i).indexOf(".com");
            String domain = urls.get(i).substring(firstIndex + 4 , lastIndex);
            if(title.contains(domain)){
                System.out.println(urls.get(i) + "  :   PASSED THE TITLE TEST");
            }else{
                System.out.println(urls.get(i) + " :   FAILED THE TITLE TEST");
            }
        }
        driver.quit();
    }

}
