package com.kincarta.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {

    Map<String, ChromiumDriver> driversMap = new HashMap<>();

    public DriverManager() {
        driversMap.put("chrome", chromeSession());
        driversMap.put("edge", edgeSession());
    }

    public ChromiumDriver getDriver(String driver){
        return driversMap.get(driver);
    }

    private ChromiumDriver chromeSession() {
        WebDriverManager.chromedriver().setup();

        return new ChromeDriver();
    }

    private ChromiumDriver edgeSession() {
        WebDriverManager.edgedriver().setup();

        return new EdgeDriver();
    }
}
