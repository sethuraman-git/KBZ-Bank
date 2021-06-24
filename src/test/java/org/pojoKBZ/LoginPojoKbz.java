package org.pojoKBZ;

import org.baseKBZ.LibGlobalKBZ;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoKbz extends LibGlobalKBZ{
	public LoginPojoKbz() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='fldLoginUserId']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='fldPasswordStandard']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='btnLogin']")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
