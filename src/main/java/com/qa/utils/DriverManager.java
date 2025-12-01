package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DriverManager {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public AppiumDriver getDriver(){
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {
        AppiumDriver driver = null;
        GlobalParams params = GlobalParams.getInstance();
        Properties props = new PropertyManager().getProps();

        if(driver == null){
            try{
                utils.log().info("initializing Appium driver");
                String appiumServerHost = props.getProperty("appiumServerHost");
                String appiumServerPort = props.getProperty("appiumPort");
                String appiumServerUrl = appiumServerHost + ":" + appiumServerPort;
                System.out.println(appiumServerUrl);
                System.out.println(new CapabilitiesManager().getCaps());
                switch(params.getPlatformName()){

                    case "Android":
                        driver = new AndroidDriver(new URL(appiumServerUrl), new CapabilitiesManager().getCaps());
                        this.setDriver(driver);
                        break;
                    case "iOS":
                        driver = new IOSDriver(new URL(appiumServerUrl), new CapabilitiesManager().getCaps());
                        break;
                }
                if(driver == null){
                    throw new Exception("driver is null. ABORT!!!");
                }
                utils.log().info("Driver is initialized");
//                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }

    }

}
