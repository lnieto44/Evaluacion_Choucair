package com.choucair.formacion.pageobjects;

import cucumber.api.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebShipping {

    @FindBy(name = "processCarrier")
    WebElement btnCheckout;

    @FindBy(css = "#cgv")
    WebElement checkboxAceptarCondiciones;

    @Entonces("^(.*) puede realizar su orden del pedido correctamente: (.*)$")
    public void terminarCompra(){
        checkboxAceptarCondiciones.click();
        btnCheckout.click();
    }

    public WebShipping (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
