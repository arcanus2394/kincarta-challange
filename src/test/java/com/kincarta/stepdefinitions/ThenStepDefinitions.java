package com.kincarta.stepdefinitions;

import io.cucumber.java8.En;

public class ThenStepDefinitions implements En {
    public ThenStepDefinitions(){
        Then("assert that the item would be available for purchase", () -> System.out.println("assert that the item would be available for purchase"));
    }
}
