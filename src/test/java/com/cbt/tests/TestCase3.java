package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase3 {

    /*
    Test case #3
    Step 1. Go to https://practice-cybertekschool.herokuapp.com
    Step 2. Click on “Multiple Buttons”
    Step 3. Click on “Button 1”Verify that result message is displayed: “Clicked on button one!
     */
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Buttons")).click();
        driver.findElement(By.xpath("//button[@onclick='button1()']")).click();
        String clickButtonMessage = driver.findElement(By.id("result")).getText();
        String expectedResult = "Clicked on button one!";
        System.out.println("Test Case-3: "+ (expectedResult.equals(clickButtonMessage)? "Pass" : "Fail"));
        BrowserUtils.println(expectedResult, clickButtonMessage);

    }

}
