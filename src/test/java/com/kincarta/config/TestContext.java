package com.kincarta.config;

import pageObjectModels.PageObjectManager;

public class TestContext {
    private DriverManager webDriverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() {
        this.webDriverManager = new DriverManager();
        this.pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
    }

    public DriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
