package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase8 {
    /*
    Test case #8
     Step 1. Go to https://practice-cybertekschool.herokuapp.com
     Step 2. Click on “Registration Form”
     Step 3. Enter “5711234354” into phone number input box.
     Step 4. Verify that warning message is displayed: “Phone format is not correct”
     */
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("phone")).sendKeys("5711234354");
        String actualPhoneWarning = driver.findElement(By.xpath("//small[@data-bv-validator='regexp' and @data-bv-for='phone']")).getText();
        String expectedPhoneWarning = "Phone format is not correct";
        System.out.println("Test Case-7: "+ (expectedPhoneWarning.equals(actualPhoneWarning)? "Pass" : "Fail"));
        BrowserUtils.println(expectedPhoneWarning,actualPhoneWarning);

        driver.close();


    }

}
