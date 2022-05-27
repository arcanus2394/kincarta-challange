package com.kincarta.stepdefinitions;


import io.cucumber.java8.En;

public class GivenStepDefinitions implements En {
    public GivenStepDefinitions(){
        Given("the user navigates to {string}", (String url) -> System.out.println("url" + url));
    }
}
