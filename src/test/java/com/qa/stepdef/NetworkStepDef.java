package com.qa.stepdef;

import com.qa.pages.NetworkPage;
import com.qa.utils.ScenarioContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;


public class NetworkStepDef {
    private final ScenarioContext ctx = ScenarioContext.getInstance();

    @When("Click setting network and internet")
    public void clickSettingNetwork() {
        new NetworkPage().clickNetworkBtn();
    }

    @And("Click Data usage")
    public void clickDataUsage() {
        new NetworkPage().clickDataUsage();
    }

    @Then("Verify data usage value")
    public void verifyDataUsageValue() {
        String actual = new NetworkPage().getMobileData();
        Assertions.assertEquals(actual, "356 kB mobile data");
    }


//    @When("Login full steps {test_data_path}")
//    public void loginFullStep(String testDataPath) {
//
//        loginPage.tabFingerPrintBtn().tabCancel();
//    }
}
