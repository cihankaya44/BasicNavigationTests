package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase6 {
    /*
    Test case #6 Step 1. Go to https://practice-cybertekschool.herokuapp.com
    Step 2. Click on “Registration Form”
    Step 3. Enter “user” into username input box.
    Step 4. Verify that warning message is displayed: “The username must be more than 6 and less than 30 characters long”
     */
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();
        //String a = driver.findElement(By.xpath("//a[.='Registration Form']")).getText();

        driver.findElement(By.name("username")).sendKeys("user");

        String actual = driver.findElement(By.xpath("//small[@data-bv-validator='stringLength' and @data-bv-for='username']")).getText();
        String expectedRes = "The username must be more than 6 and less than 30 characters long";

        System.out.println("Test Case-6: "+ (expectedRes.equals(actual)? "Pass" : "Fail"));
        BrowserUtils.println(expectedRes,actual);

        driver.quit();


    }
}
