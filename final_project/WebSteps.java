package com.example.catalog.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class WebSteps {

    @When("I send a GET request to {string}")
    public void iSendAGetRequestTo(String url) {
        // Simulate GET request
    }

    @Then("the response status should be {int}")
    public void theResponseStatusShouldBe(int statusCode) {
        // Verify response status
    }

    @Then("the response should contain {string}")
    public void theResponseShouldContain(String content) {
        // Verify response content
    }
}
