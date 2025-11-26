package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import com.qa.locators.LoginLocator;
public class LoginPage extends BasePage {
	TestUtils utils = new TestUtils();



	public LoginPage(){
	}

	public LoginPage tabFingerPrintBtn() {
		click(LoginLocator.fingerBtn);
		return this;
	}
	public LoginPage tabCancel() {
		click(LoginLocator.cancelBtn);
		return this;
	}

//public LoginPage enterUserName(String username) throws InterruptedException {
//	clear(usernameTxtFld);
//	sendKeys(usernameTxtFld, username, "login with " + username);
//	return this;
//}
//
//public LoginPage enterPassword(String password) {
//	clear(passwordTxtFld);
//	sendKeys(passwordTxtFld, password, "password is " + password);
//	return this;
//}
//
//public ProductsPage pressLoginBtn() {
//	click(loginBtn, "press login button");
//	return new ProductsPage();
//}
//
//public ProductsPage login(String username, String password) throws InterruptedException {
//	enterUserName(username);
//	enterPassword(password);
//	return pressLoginBtn();
//}
//
//public String getErrTxt() {
//	String err = getText(errTxt, "error text is - ");
//	return err;
//}

}
