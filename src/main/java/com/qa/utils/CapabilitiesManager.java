package com.qa.utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
    TestUtils utils = new TestUtils();

    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params =  GlobalParams.getInstance();
        Properties props = new PropertyManager().getProps();

        try{
            DesiredCapabilities caps = new DesiredCapabilities();
            if (!params.getEnv().equals("prod")) {
                caps.setCapability("appium:deviceId", params.getUDID());
            }

            caps.setCapability("appium:platformName", params.getPlatformName());
            caps.setCapability("appium:platformVersion", params.getPlatformVersion());
            caps.setCapability("appium:deviceName", params.getDeviceName());

            switch(params.getPlatformName()){
                case "android":
                    caps.setCapability("appium:automationName", props.getProperty("android.automationName"));
                    caps.setCapability("appium:appPackage", props.getProperty("android.appPackage"));
                    caps.setCapability("appium:appActivity", props.getProperty("android.appActivity"));
                    break;
                case "ios":
                    caps.setCapability("appium:automationName", props.getProperty("ios.automationName"));
                    caps.setCapability("appium:bundleId", props.getProperty("ios.bundleId"));
                    caps.setCapability("appium:wdaLocalPort", params.getWdaLocalPort());
                    caps.setCapability("appium:webkitDebugProxyPort", params.getWebkitDebugProxyPort());
                    break;
            }
            return caps;
        } catch(Exception e){
            e.printStackTrace();
            utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
            throw e;
        }
    }
}
