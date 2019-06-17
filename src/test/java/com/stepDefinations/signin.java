package com.stepDefinations;

import com.pages.signin_page;
import com.webDriverClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class signin extends webDriverClass {
    signin_page signInPage = PageFactory.initElements(driver, signin_page.class);


   @Given("^I open URL as \"([^\"]*)\"$")
    public void iGotoURLAs(String URL) {
       signInPage.GotoURL(URL);
    }
    @When("^I click Register button$")
            public void iClickRegisterButton() {
        signInPage.ClickRegisterButton();
    }

    @Given("^I open URL as \"([^\"]*)\"$")
    public void iOpenURLAs(String arg0) {
    }
}

            //@Given("^Enter firstname as \"([^\"]*)\"$")
                    //public void enter firstnameAs (String firstname){






