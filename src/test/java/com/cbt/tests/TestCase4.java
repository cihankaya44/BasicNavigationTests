package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase4 {
    /*

        Test case #4 Step 1. Go to https://practice-cybertekschool.herokuapp.com
        Step 2. Click on “Registration Form”
        Step 3. Enter “123” into first name input box.
        Step 4. Verify that warning message is displayed: “first name can only consist of alphabetical letters”
     */
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();
        //String a = driver.findElement(By.xpath("//a[.='Registration Form']")).getText();

        driver.findElement(By.name("firstname")).sendKeys("123");

        String actual = driver.findElement(By.xpath("//small[@data-bv-validator='regexp' and @data-bv-for='firstname']")).getText();
        String expectedRes = "first name can only consist of alphabetical letters";

        System.out.println("Test Case-4: "+ (expectedRes.equals(actual)? "Pass" : "Fail"));
        BrowserUtils.println(expectedRes,actual);

        driver.close();


    }
}
