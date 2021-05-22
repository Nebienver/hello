package com.cybertek.tests.day01_slenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // 1. set up the Web Driver
        WebDriverManager.chromedriver().setup();

        // 2. Creat the instance of the Chrome Driver
        WebDriver driver = new ChromeDriver();

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(3000);

                // 3. Test if the Driver is working
        driver.get("https://www.google.com");

    }
}
