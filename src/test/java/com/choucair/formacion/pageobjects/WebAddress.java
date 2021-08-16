package com.choucair.formacion.pageobjects;

import cucumber.api.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebAddress {

    @FindBy(name = "processAddress")
    WebElement btnCheckout;

    @Entonces("^(.*) deberia ver los campos diligenciados y seleccionados para realizar la compra: (.*)$")
    public void HacerClickCheckout(){
        btnCheckout.click();
    }

    public WebAddress (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}

