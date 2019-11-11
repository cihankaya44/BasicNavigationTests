package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement l1 = driver.findElement(By.linkText("Sign Up For Mailing List"));

        l1.click();

        driver.findElement(By.name("full_name")).sendKeys("User name");

        driver.findElement(By.name("email")).sendKeys("1234@gmail.com");

        driver.findElement(By.className("radius")).click();


        WebElement actual = driver.findElement(By.name("signup_message"));
        String actualResult = actual.getText();
        String expectedResult = "Thank you for signing up. Click the button below to return to the home page.";

        if(actualResult.equals(expectedResult)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("expectedResult: "+ expectedResult);
            System.out.println("actualResult: "+ actualResult);
        }

        driver.quit();



    }
}
