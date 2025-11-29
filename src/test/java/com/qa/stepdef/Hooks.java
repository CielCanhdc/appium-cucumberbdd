package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.utils.DriverManager;
import io.cucumber.java.*;
import com.qa.utils.GlobalParams;
import org.openqa.selenium.OutputType;
import com.qa.utils.ScenarioContext;
import java.io.IOException;

public class Hooks {
    @BeforeAll
    public static void beforeAll() throws Exception {
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();
    }

    @Before
    public void initialize() throws Exception {
        new DriverManager().initializeDriver();
    }

    @After
    public void quit(Scenario scenario) throws IOException {
//        if(scenario.isFailed()){
//            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//        }

//        DriverManager driverManager = new DriverManager();
//        if(driverManager.getDriver() != null){
//            driverManager.getDriver().quit();
//            driverManager.setDriver(null);
//        }
    }

    @AfterAll
    public static void tearDownAll() throws Exception {
    }
}
