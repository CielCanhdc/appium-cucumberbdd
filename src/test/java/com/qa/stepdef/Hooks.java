package com.qa.stepdef;

import io.cucumber.java.*;
import com.qa.utils.GlobalParams;
import com.qa.utils.DevicePool;

import java.io.IOException;
import java.util.Map;

public class Hooks {
    private Map<String, Object> device;
    @BeforeAll
    public static void beforeAll() throws Exception {
        DevicePool.initDevicePool();
    }

    @Before
    public void initialize() throws Exception {
        GlobalParams params = GlobalParams.getInstance();
        params.initializeGlobalParams();

        device = DevicePool.holdDevice();


        params.setUDID(device.get("udid").toString());
        params.setAppiumPort(device.get("appiumPort").toString());



//
//        new DriverManager().initializeDriver();
    }

    @After
    public void quit(Scenario scenario) throws IOException {

        DevicePool.releaseDevice(device);
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
