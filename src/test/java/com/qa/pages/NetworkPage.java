package com.qa.pages;

import com.qa.locators.LoginLocator;
import com.qa.locators.NetworkLocator;
import com.qa.utils.TestUtils;

public class NetworkPage extends BasePage {
	TestUtils utils = new TestUtils();



	public NetworkPage(){
	}

	public NetworkPage clickNetworkBtn() {
		click(NetworkLocator.networkBtn);
		return this;
	}
	public NetworkPage clickDataUsage() {
		click(NetworkLocator.dataUsageBtn);
		return this;
	}

	public String getMobileData() {
		return getText(NetworkLocator.mobileDataTxt);
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
