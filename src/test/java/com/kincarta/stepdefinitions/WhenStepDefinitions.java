package com.kincarta.stepdefinitions;

import io.cucumber.java8.En;

public class WhenStepDefinitions implements En {
    public WhenStepDefinitions(){
        When("Searches for {string}", (String url) -> System.out.println("url" + url));
        When("navigates to the second page", () -> System.out.println("navigates to the second page"));
        When("selects the third item", () -> System.out.println("selects the third item"));
    }
}