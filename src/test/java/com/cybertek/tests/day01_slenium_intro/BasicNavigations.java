package com.cybertek.tests.day01_slenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");

        System.out.println("Current title: " +driver.getTitle());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("CurrentUrl = " + currentUrl);

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(2000);
        //going back using navigations
        driver.navigate().back();

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(2000);
        driver.navigate().forward();

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(2000);
        driver.navigate().refresh();

        //putting 3 seconds of wait/ stops the code for 3 sec
        Thread.sleep(2000);
        //going to another url using.to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " +driver.getTitle());

        currentUrl = driver.getCurrentUrl();

        System.out.println("CurrentUrl = " + currentUrl);

        driver.close();


    }
}
