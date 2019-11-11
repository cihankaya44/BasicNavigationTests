package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase7 {
    /*
    Test case #7 Step 1. Go to https://practice-cybertekschool.herokuapp.com
    Step 2. Click on “Registration Form”
    Step 3. Enter “testers@email” into email input box.
    Step 4. Verify that warning message is displayed: “email address is not a validEmail format is not correct”
     */
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();;
        driver.findElement(By.name("email")).sendKeys("testers@email");

        String actualEmailError = driver.findElement(By.xpath("//small[@data-bv-validator='emailAddress' and @data-bv-for='email']")).getText()+"\n\t\t\t\t\t"
                +driver.findElement(By.xpath("//small[@data-bv-validator='regexp' and @data-bv-for='email']")).getText();
        String expectedEmailError= "email address is not a valid\n\t\t\t\t\tEmail format is not correct";
        System.out.println("Test Case-7: "+ (expectedEmailError.equals(actualEmailError)? "Pass" : "Fail"));
        BrowserUtils.println(expectedEmailError,actualEmailError);

        driver.close();



    }
}
