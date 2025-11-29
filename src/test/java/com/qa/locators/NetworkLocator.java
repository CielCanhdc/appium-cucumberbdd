package com.qa.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class NetworkLocator {

    public static final By networkBtn = MobileBy.xpath("//*[@resource-id=\"android:id/title\" and @text=\"Network & Internet\"]");
    public static final By dataUsageBtn = MobileBy.xpath("//*[@resource-id=\"android:id/title\" and @text=\"Data usage\"]");
    public static final By mobileDataTxt = MobileBy.xpath("//*[@resource-id=\"com.android.settings:id/list\"]/*[2]/*[@resource-id=\"android:id/title\"]");


}
