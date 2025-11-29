package com.qa.stepdef;

import com.qa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.qa.utils.ScenarioContext;
import org.junit.jupiter.api.Assertions;


public class LoginStepDef {
    private final ScenarioContext ctx = ScenarioContext.getInstance();

    @When("Click setting finger")
    public void clickSettingFinger() {
        new LoginPage().tabFingerPrintBtn();
        ctx.setContext("name", "Canhdc");

    }

    @And("Click cancer button")
    public void clickCancerButton() {
        new LoginPage().tabCancel();
        String myName = (String) ctx.getContext("name");
        Assertions.assertEquals(myName, "Canhdc");
        ctx.setContext("name", "Canhdc2");
    }
//    @When("Login full steps {test_data_path}")
//    public void loginFullStep(String testDataPath) {
//
//        loginPage.tabFingerPrintBtn().tabCancel();
//    }
}
