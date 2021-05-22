package com.cybertek.tests.day01_slenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        String expectedTitle = "Yahoo";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Tile is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED");
        }

        driver.close();




    }
}
