package org.stepDefKBZ;

import java.io.IOException;

import org.baseKBZ.LibGlobalKBZ;
import org.pojoKBZ.LoginPojoKbz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef2 extends LibGlobalKBZ {
	

	@Given("User have to enter into KBZ login page")
	public void user_have_to_enter_into_KBZ_login_page() {
		toLoadUrl("https://ibanking.kbzbank.com/B001/login.jsp");
	}

	@When("User have to pass invalid username")
	public void user_have_to_pass_invalid_username() throws IOException {
		LoginPojoKbz l = new LoginPojoKbz();
	    toType(l.getUsername(), excelRead("KBZBanklog", "KBZBankSheet1", 6, 3));
	}
	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		LoginPojoKbz l = new LoginPojoKbz();
		toClick(l.getLoginbtn());
	}

	@Then("User should be getting alert")
	public void user_should_be_getting_alert() {
	    System.out.println("User getting alert message 'Please fill out this field'");
	}

	@When("User have to pass invalid password")
	public void user_have_to_pass_invalid_password() throws IOException {
		LoginPojoKbz l = new LoginPojoKbz();
		toType(l.getPassword(), excelRead("KBZBanklog", "KBZBankSheet1", 17, 3));
	}

	@When("User have to pass valid password")
	public void user_have_to_pass_valid_password() throws IOException {
		LoginPojoKbz l = new LoginPojoKbz();
		toType(l.getPassword(), excelRead("KBZBanklog", "KBZBankSheet1", 11, 3));
	}


}
