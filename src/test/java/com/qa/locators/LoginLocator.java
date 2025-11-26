package com.qa.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginLocator {

    public static final By fingerBtn = MobileBy.xpath("//*[@resource-id=\"android:id/title\" and @text=\"Use fingerprint\"]");
    public static final By cancelBtn = MobileBy.xpath("//*[@resource-id=\"com.android.settings:id/fingerprint_cancel_button\"]");


}
