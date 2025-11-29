package com.qa.stepdef;

import io.cucumber.java.en.And;
import com.qa.pages.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.qa.utils.ScenarioContext;
import org.junit.jupiter.api.Assertions;

public class MenuStepDef {
    private ScenarioContext ctx = ScenarioContext.getInstance();
//    public MenuStepDef(ScenarioContext ctx) {
//        this.ctx = ctx; // Shared instance injected
//    }
    @And("Click Setting again")
    public void clickSettingAgain() {
        new MenuPage().tabFingerPrintAgainBtn();
        String myName = (String) ctx.getContext("name");
        Assertions.assertEquals(myName, "Canhdc2");
    }
}
