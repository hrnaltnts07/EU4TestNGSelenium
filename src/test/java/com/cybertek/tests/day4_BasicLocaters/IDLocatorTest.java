package com.cybertek.tests.day4_BasicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorTest {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //click dont click button
        WebElement dontClickElement= driver.findElement(By.id("disappearing_button"));
        //if you write id wrong, you see NO SUCH ELEMENT ERROR
        dontClickElement.click();



    }
}
