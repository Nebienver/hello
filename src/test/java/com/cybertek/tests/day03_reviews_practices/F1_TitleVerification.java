package com.cybertek.tests.day03_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String expectedTile = "FACEBOOK - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTile)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");
        }


    }
}
