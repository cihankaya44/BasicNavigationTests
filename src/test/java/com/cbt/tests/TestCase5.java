package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase5 {

    /*
    Test case #5 Step 1. Go to https://practice-cybertekschool.herokuapp.com
    Step 2. Click on “Registration Form”
    Step 3. Enter “123” into last name input box.
    Step 4. Verify that warning message is displayed: “The last name can only consist of alphabetical letters and dash”
     */


    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();
        //String a = driver.findElement(By.xpath("//a[.='Registration Form']")).getText();

        driver.findElement(By.name("lastname")).sendKeys("123");

        String actual = driver.findElement(By.xpath("//small[@data-bv-validator='regexp' and @data-bv-for='lastname']")).getText();
        String expectedRes = "The last name can only consist of alphabetical letters and dash";

        System.out.println("Test Case-5: "+ (expectedRes.equals(actual)? "Pass" : "Fail"));
        BrowserUtils.println(expectedRes,actual);

        driver.quit();
    }
}
