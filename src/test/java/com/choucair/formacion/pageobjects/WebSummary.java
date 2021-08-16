package com.choucair.formacion.pageobjects;

import cucumber.api.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebSummary {

    @FindBy(css = ".btn-default.standard-checkout.button-medium")
    WebElement btnCheckout;

    @Entonces("^(.*) deberia ver los campos diligenciados y seleccionados para realizar la compra: (.*)$")
    public void hacerClickCheckout(){
        btnCheckout.click();
    }

    public WebSummary (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
