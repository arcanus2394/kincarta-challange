package com.kincarta.config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private ChromeDriver driver;

    public DriverManager() {
        chromeSession();
    }

    private void chromeSession() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pablo Agudelo\\workspace\\kincarta\\kincarta-challange\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "test-type", "--disable-web-security", "--allow-running-insecure-content");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    public ChromeDriver getDriver(){
        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}
