package com.kincarta;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/"}, glue = {"com.kincarta.stepdefinitions"})
public class TestRunner {
}
