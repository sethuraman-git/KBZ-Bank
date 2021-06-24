package org.stepDefKBZ;

import java.io.IOException;

import org.baseKBZ.LibGlobalKBZ;
import org.pojoKBZ.LoginPojoKbz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef1 extends LibGlobalKBZ {


@Given("User have to enter into the KBZ bank login page")
public void user_have_to_enter_into_the_KBZ_bank_login_page() {
	toLoadUrl("https://ibanking.kbzbank.com/B001/login.jsp");
}

@When("User have to pass invalid username in the field")
public void user_have_to_pass_invalid_username_in_the_field() throws IOException {
    LoginPojoKbz l = new LoginPojoKbz();
    toType(l.getUsername(), excelRead("KBZBanklog", "KBZBankSheet1", 2, 3));
}

@When("User have to pass invalid password in the field")
public void user_have_to_pass_invalid_password_in_the_field() throws IOException {
	LoginPojoKbz l = new LoginPojoKbz();
    toType(l.getPassword(), excelRead("KBZBanklog", "KBZBankSheet1", 3, 3));
}

@When("User have to click the login button")
public void user_have_to_click_the_login_button() {
	LoginPojoKbz l = new LoginPojoKbz();
	toClick(l.getLoginbtn());
	
}

@Then("User should be getting the alert")
public void user_should_be_getting_the_alert() {
	System.out.println("User is in invalid credential page");
}

@When("User have to pass valid password in the field")
public void user_have_to_pass_valid_password_in_the_field() throws IOException {
	LoginPojoKbz l = new LoginPojoKbz();
	toType(l.getPassword(), excelRead("KBZBanklog", "KBZBankSheet1", 5, 3));
}

@When("User have to pass username without @")
public void user_have_to_pass_username_without() throws IOException {
	LoginPojoKbz l = new LoginPojoKbz();
	toType(l.getUsername(), excelRead("KBZBanklog", "KBZBankSheet1", 14, 3));
	
}

@Then("User should be getting alert message")
public void user_should_be_getting_alert_message() {
	System.out.println("User is in invalid credential page");
}

@When("User have to pass username without .com at the end")
public void user_have_to_pass_username_without_com_at_the_end() throws IOException {
	LoginPojoKbz l = new LoginPojoKbz();
	toType(l.getUsername(), excelRead("KBZBanklog", "KBZBankSheet1", 16, 3));
}


}
