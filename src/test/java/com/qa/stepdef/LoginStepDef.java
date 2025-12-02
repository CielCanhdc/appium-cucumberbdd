package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.utils.GlobalParams;
import com.qa.utils.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.qa.utils.ScenarioContext;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.Properties;
import com.qa.utils.GlobalParams;

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

    @When("print abc")
    public void printAbc() {
        GlobalParams params = GlobalParams.getInstance();
        System.out.println("Thread: " + Thread.currentThread().getId() + "| Feature1: " + params.getUDID());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("print def")
    public void printDef() {
        GlobalParams params = GlobalParams.getInstance();
        System.out.println("Thread: " + Thread.currentThread().getId()  + "| Feature2 " + params.getUDID());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("print parallel third")
    public void printParallelThird() {
        GlobalParams params = GlobalParams.getInstance();
        System.out.println("Thread: " + Thread.currentThread().getId()  + "| Feature3 " + params.getUDID());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
//    @When("Login full steps {test_data_path}")
//    public void loginFullStep(String testDataPath) {
//
//        loginPage.tabFingerPrintBtn().tabCancel();
//    }
}
