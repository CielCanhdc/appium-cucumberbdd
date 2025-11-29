package com.qa.stepdef;

import com.qa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.qa.utils.ScenarioContext;
import org.junit.Assert;

public class LoginStepDef {
    private final ScenarioContext ctx = ScenarioContext.getInstance();

//    public LoginStepDef(ScenarioContext ctx) {
//        this.ctx = ctx; // Shared instance injected
//    }
//    @When("I enter username as {string}")
//    public void iEnterUsernameAs(String username) throws InterruptedException {
//        new LoginPage().enterUserName(username);
//    }
//
//    @When("I enter password as {string}")
//    public void iEnterPasswordAs(String password) {
//        new LoginPage().enterPassword(password);
//    }
//
//    @When("I login")
//    public void iLogin() {
//        new LoginPage().pressLoginBtn();
//    }
//
//    @Then("login should fail with an error {string}")
//    public void loginShouldFailWithAnError(String err) {
//        Assert.assertEquals(new LoginPage().getErrTxt(), err);
//    }
//
//    @Then("I should see Products page with title {string}")
//    public void iShouldSeeProductsPageWithTitle(String title) {
////        Assert.assertEquals(new ProductsPage().getTitle(), title);
//    }

    @When("Click setting finger")
    public void clickSettingFinger() {
        new LoginPage().tabFingerPrintBtn();
        ctx.setContext("name", "Canhdc");

    }

    @And("Click cancer button")
    public void clickCancerButton() {
        new LoginPage().tabCancel();
        String myName = (String) ctx.getContext("name");
        Assert.assertEquals(myName, "Canhdc");
        ctx.setContext("name", "Canhdc2");
    }
//    @When("Login full steps {test_data_path}")
//    public void loginFullStep(String testDataPath) {
//
//        loginPage.tabFingerPrintBtn().tabCancel();
//    }
}
