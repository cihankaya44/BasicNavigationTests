package com.cbt.tests;

import com.cbt.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");

        int sizeOfListedExamples = driver.findElements(By.className("list-group-item")).size();
        System.out.println("Test Case-2: "+ ( 48==sizeOfListedExamples? "Pass": "Fail"));
        BrowserUtils.println("48", sizeOfListedExamples+"");

    }
}
